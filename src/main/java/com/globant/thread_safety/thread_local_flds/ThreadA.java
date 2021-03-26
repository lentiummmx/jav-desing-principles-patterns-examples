package com.globant.thread_safety.thread_local_flds;

import java.util.Arrays;
import java.util.List;

/**
 * 4. Thread-Local Fields
 * In object-oriented programming (OOP), objects actually need to maintain state through fields and
 * implement behavior through one or more methods.
 *
 * If we actually need to maintain state, we can create thread-safe classes that don't share state
 * between threads by making their fields thread-local.
 *
 * We can easily create classes whose fields are thread-local by simply defining private fields in
 * Thread classes.
 *
 * We could define, for instance, a Thread class that stores an array of integers:
 */
public class ThreadA extends Thread {

    private final List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

    @Override
    public void run() {
        numbers.forEach(System.out::println);
    }
}
/**
 * While another one might hold an array of strings: ThreadB
 *
 * In both implementations, the classes have their own state, but it's not shared with other threads.
 * Thus, the classes are thread-safe.
 */
