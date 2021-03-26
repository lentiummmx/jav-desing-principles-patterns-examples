package com.globant.thread_safety.stateless;

import java.math.BigInteger;

/**
 * 2. Stateless Implementations
 * In most cases, errors in multithreaded applications are the result of incorrectly sharing state
 * between several threads.
 *
 * Therefore, the first approach that we'll look at is to achieve thread-safety using stateless
 * implementations.
 *
 * To better understand this approach, let's consider a simple utility class with a static method
 * that calculates the factorial of a number
 */
public class MathUtils {
    public static BigInteger factorial(int number) {
        BigInteger f = new BigInteger("1");
        for (int i = 2; i <= number; i++) {
            f = f.multiply(BigInteger.valueOf(i));
        }
        return f;
    }
}
/**
 * The factorial() method is a stateless deterministic function. Given a specific input, it always
 * produces the same output.
 *
 * The method neither relies on external state nor maintains state at all. Hence, it's considered to
 * be thread-safe and can be safely called by multiple threads at the same time.
 *
 * All threads can safely call the factorial() method and will get the expected result without
 * interfering with each other and without altering the output that the method generates for other
 * threads.
 *
 * Therefore, stateless implementations are the simplest way to achieve thread-safety.
 */
