package com.globant.thread_safety.sync_stmnts;

/**
 * 9.2. Caveats
 * Even though we can use any Java object as an intrinsic lock, we should avoid using Strings for
 * locking purposes:
 */
public class Caveats {
    public class Class1 {
        private static final String LOCK = "Lock";
        // uses the LOCK as the intrinsic lock
    }

    public class Class2 {
        private static final String LOCK = "Lock";
        // uses the LOCK as the intrinsic lock
    }
}
/**
 * At first glance, it seems that these two classes are using two different objects as their lock.
 * However, because of string interning, these two “Lock” values may actually refer to the same
 * object on the string pool. That is, the Class1 and Class2 are sharing the same lock!
 *
 * This, in turn, may cause some unexpected behaviors in concurrent contexts.
 *
 * In addition to Strings, we should avoid using any cacheable or reusable objects as intrinsic
 * locks. For example, the Integer.valueOf() method caches small numbers. Therefore, calling
 * Integer.valueOf(1) returns the same object even in different classes.
 */
