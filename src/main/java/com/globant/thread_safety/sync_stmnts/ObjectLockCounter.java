package com.globant.thread_safety.sync_stmnts;

import lombok.Getter;

/**
 * 9.1. Other Objects as a Lock
 * We can slightly improve the thread-safe implementation of the Counter class by exploiting another
 * object as a monitor lock, instead of this.
 *
 * Not only does this provide coordinated access to a shared resource in a multithreaded environment,
 * but also it uses an external entity to enforce exclusive access to the resource:
 */
public class ObjectLockCounter {

    @Getter
    private int counter = 0;
    private final Object lock = new Object();

    public void incrementCounter() {
        synchronized (lock) {
            counter++;
        }
    }

    // standard getter
}
/**
 * We use a plain Object instance to enforce mutual exclusion. This implementation is slightly better,
 * as it promotes security at the lock level.
 *
 * When using this for intrinsic locking, an attacker could cause a deadlock by acquiring the intrinsic
 * lock and triggering a denial of service (DoS) condition.
 *
 * On the contrary, when using other objects, that private entity is not accessible from the outside.
 * This makes it harder for an attacker to acquire the lock and cause a deadlock.
 */
