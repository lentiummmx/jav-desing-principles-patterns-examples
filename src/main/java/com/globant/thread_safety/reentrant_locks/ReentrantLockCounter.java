package com.globant.thread_safety.reentrant_locks;

import lombok.Getter;

import java.util.concurrent.locks.ReentrantLock;

/**
 * 11. Reentrant Locks
 * Java provides an improved set of Lock implementations, whose behavior is slightly more
 * sophisticated than the intrinsic locks discussed above.
 *
 * With intrinsic locks, the lock acquisition model is rather rigid: one thread acquires the lock,
 * then executes a method or code block, and finally releases the lock, so other threads can acquire
 * it and access the method.
 *
 * There's no underlying mechanism that checks the queued threads and gives priority access to the
 * longest waiting threads.
 *
 * ReentrantLock instances allow us to do exactly that, hence preventing queued threads from
 * suffering some types of resource starvation:
 */
public class ReentrantLockCounter {

    @Getter
    private int counter;
    private final ReentrantLock reLock = new ReentrantLock(true);

    public void incrementCounter() {
        reLock.lock();
        try {
            counter++;
        } finally {
            reLock.unlock();
        }
    }

    // standard constructors / getter
}
/**
 * The ReentrantLock constructor takes an optional fairness boolean parameter. When set to true, and
 * multiple threads are trying to acquire a lock, the JVM will give priority to the longest waiting
 * thread and grant access to the lock.
 */
