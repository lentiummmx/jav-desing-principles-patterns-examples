package com.globant.thread_safety.sync_mthds;

/**
 * 8. Synchronized Methods
 * While the earlier approaches are very good for collections and primitives, we will at times need
 * greater control than that.
 *
 * So, another common approach that we can use for achieving thread-safety is implementing
 * synchronized methods.
 *
 * Simply put, only one thread can access a synchronized method at a time while blocking access to
 * this method from other threads. Other threads will remain blocked until the first thread finishes
 * or the method throws an exception.
 *
 * We can create a thread-safe version of incrementCounter() in another way by making it a
 * synchronized method:
 */
public class SynchronizedMethods {
    private int counter = 0;
    public synchronized void incrementCounter() {
        counter ++;
    }
    public int getCounter() {
        return counter;
    }
}
/**
 * We've created a synchronized method by prefixing the method signature with the synchronized
 * keyword.
 *
 * Since one thread at a time can access a synchronized method, one thread will execute the
 * incrementCounter() method, and in turn, others will do the same. No overlapping execution will
 * occur whatsoever.
 *
 * Synchronized methods rely on the use of “intrinsic locks” or “monitor locks”. An intrinsic lock
 * is an implicit internal entity associated with a particular class instance.
 *
 * In a multithreaded context, the term monitor is just a reference to the role that the lock
 * performs on the associated object, as it enforces exclusive access to a set of specified methods
 * or statements.
 *
 * When a thread calls a synchronized method, it acquires the intrinsic lock. After the thread
 * finishes executing the method, it releases the lock, hence allowing other threads to acquire the
 * lock and get access to the method.
 *
 * We can implement synchronization in instance methods, static methods, and statements
 * (synchronized statements).
 */
