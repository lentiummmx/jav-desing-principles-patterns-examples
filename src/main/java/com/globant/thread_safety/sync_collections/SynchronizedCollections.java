package com.globant.thread_safety.sync_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/**
 * 5. Synchronized Collections
 * We can easily create thread-safe collections by using the set of synchronization wrappers included
 * within the collections framework.
 *
 * We can use, for instance, one of these synchronization wrappers to create a thread-safe collection:
 */
public class SynchronizedCollections {
    public static void main(String[] args) {
        Collection<Integer> syncCollection = Collections.synchronizedCollection(new ArrayList<>());
        Thread thread1 = new Thread(() -> syncCollection.addAll(Arrays.asList(1, 2, 3, 4, 5, 6)));
        Thread thread2 = new Thread(() -> syncCollection.addAll(Arrays.asList(7, 8, 9, 10, 11, 12)));
        thread1.start();
        thread2.start();
    }
}
/**
 * Let's keep in mind that synchronized collections use intrinsic locking in each method (we'll look
 * at intrinsic locking later).
 *
 * This means that the methods can be accessed by only one thread at a time, while other threads will
 * be blocked until the method is unlocked by the first thread.
 *
 * Thus, synchronization has a penalty in performance, due to the underlying logic of synchronized
 * access.
 */
