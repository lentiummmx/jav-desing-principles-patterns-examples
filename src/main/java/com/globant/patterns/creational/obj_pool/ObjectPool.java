package com.globant.patterns.creational.obj_pool;

import java.util.concurrent.*;

public abstract class ObjectPool<T> {

    private ConcurrentLinkedQueue<T> pool;
    private ScheduledExecutorService executorService;

    public ObjectPool(final int minObjects) {
        initialize(minObjects);
    }

    public ObjectPool(final int minObjects, final int maxObjects, final long validationInterval) {
        initialize(minObjects);

        executorService = Executors.newSingleThreadScheduledExecutor();
        executorService.scheduleWithFixedDelay(new Runnable() {
            @Override
            public void run() {
                int size = pool.size();

                if (size < minObjects) {
                    int sizeToBeAdded = minObjects + size;
                    for (int i = 0; i < sizeToBeAdded; i++) {
                        pool.add(createObject());
                    }
                } else if (size > maxObjects) {
                    int sizeToBeRemoved = size - maxObjects;
                    for (int i = 0; i < sizeToBeRemoved; i++) {
                        pool.poll();
                    }
                }
            }
        }, validationInterval, validationInterval, TimeUnit.SECONDS);
    }

    public T borrowObject() {
        T object;
        if ((object = pool.poll()) == null) {
            object = createObject();
        }
        return object;
    }

    public void returnObject(T object) {
        if (object == null) {
            return;
        }
        this.pool.offer(object);
    }

    public void shutdownPool() {
        if (executorService != null){
            executorService.shutdown();
        }
    }

    protected abstract T createObject();

    public void initialize(final int minObjects) {
        pool = new ConcurrentLinkedQueue<>();
        for (int i = 0; i < minObjects; i++) {
            pool.add(createObject());
        }
    }
}
