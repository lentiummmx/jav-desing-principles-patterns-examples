package com.globant.thread_safety.sync_stmnts;

/**
 * 9. Synchronized Statements
 * Sometimes, synchronizing an entire method might be overkill if we just need
 * to make a segment of the method thread-safe.
 *
 * To exemplify this use case, let's refactor the incrementCounter() method:
 */
public class SynchronizedStatements {
    private int counter = 0;
    public void incrementCounter() {
        // additional unsynced operations
        synchronized (this) {
            counter ++;
        }
    }
    public int getCounter() {
        return counter;
    }
}
/**
 * The example is trivial, but it shows how to create a synchronized statement.
 * Assuming that the method now performs a few additional operations, which don't
 * require synchronization, we only synchronized the relevant state-modifying
 * section by wrapping it within a synchronized block.
 *
 * Unlike synchronized methods, synchronized statements must specify the object
 * that provides the intrinsic lock, usually the this reference.
 *
 * Synchronization is expensive, so with this option, we are able to only
 * synchronize the relevant parts of a method.
 */
