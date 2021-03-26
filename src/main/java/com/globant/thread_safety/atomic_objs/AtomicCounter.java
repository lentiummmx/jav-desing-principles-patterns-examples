package com.globant.thread_safety.atomic_objs;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Let's create a thread-safe implementation of the Counter class by using an
 * AtomicInteger object:
 */
public class AtomicCounter {
    private final AtomicInteger counter = new AtomicInteger();

    public void incrementCounter() {
        counter.incrementAndGet();
    }

    public int getCounter() {
        return counter.get();
    }
}
/**
 * This is thread-safe because, while incrementation, ++, takes more than one
 * operation, incrementAndGet is atomic.
 */
