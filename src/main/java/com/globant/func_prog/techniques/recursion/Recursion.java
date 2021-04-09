package com.globant.func_prog.techniques.recursion;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Recursion {
    private static Logger logger = Logger.getGlobal();

    private static Integer factorialHeadRecursion(Integer number) {
        return (number == 1) ? 1 : number * factorialHeadRecursion(number - 1);
    }

    private static Integer factorialTailRecursion(Integer number, Integer result) {
        return (number == 1) ? result : factorialTailRecursion(number - 1, result * number);
    }

    public static void main(String[] args) {
        logger.log(Level.INFO, "HeadRecursion: " + factorialHeadRecursion(5));
        logger.log(Level.INFO, "TailRecursion: " + factorialTailRecursion(5, 1));
    }
}
