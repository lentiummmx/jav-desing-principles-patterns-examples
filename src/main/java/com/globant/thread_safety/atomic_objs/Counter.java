package com.globant.thread_safety.atomic_objs;

/**
 * 7. Atomic Objects
 * It's also possible to achieve thread-safety using the set of atomic classes that Java provides,
 * including AtomicInteger, AtomicLong, AtomicBoolean, and AtomicReference.
 *
 * Atomic classes allow us to perform atomic operations, which are thread-safe, without using
 * synchronization. An atomic operation is executed in one single machine level operation.
 *
 * To understand the problem this solves, let's look at the following Counter class:
 */
public class Counter {
    private int counter = 0;

    public void incrementCounter() {
        counter++;
    }

    public int getCounter() {
        return counter;
    }
}
/**
 * Let's suppose that in a race condition, two threads access the incrementCounter() method at the
 * same time.
 *
 * In theory, the final value of the counter field will be 2. But we just can't be sure about the
 * result, because the threads are executing the same code block at the same time and incrementation
 * is not atomic.
 */
