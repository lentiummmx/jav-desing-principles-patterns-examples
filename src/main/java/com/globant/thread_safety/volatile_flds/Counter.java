package com.globant.thread_safety.volatile_flds;

import lombok.Getter;

/**
 * 10. Volatile Fields
 * Synchronized methods and blocks are handy for addressing variable visibility problems among
 * threads. Even so, the values of regular class fields might be cached by the CPU. Hence,
 * consequent updates to a particular field, even if they're synchronized, might not be visible to
 * other threads.
 *
 * To prevent this situation, we can use volatile class fields:
 */
public class Counter {

    @Getter
    private volatile int counter;

    // standard constructors / getter
}
/**
 * With the volatile keyword, we instruct the JVM and the compiler to store the counter variable in
 * the main memory. That way, we make sure that every time the JVM reads the value of the counter
 * variable, it will actually read it from the main memory, instead of from the CPU cache. Likewise,
 * every time the JVM writes to the counter variable, the value will be written to the main memory.
 *
 * Moreover, the use of a volatile variable ensures that all variables that are visible to a given
 * thread will be read from the main memory as well.
 *
 * Let's consider the following example: User.java
 *
 * In this case, each time the JVM writes the age volatile variable to the main memory, it will
 * write the non-volatile name variable to the main memory as well. This assures that the latest
 * values of both variables are stored in the main memory, so consequent updates to the variables
 * will automatically be visible to other threads.
 *
 * Similarly, if a thread reads the value of a volatile variable, all the variables visible to the
 * thread will be read from the main memory too.
 *
 * This extended guarantee that volatile variables provide is known as the full volatile visibility
 * guarantee.
 */
