package com.globant.func_prog.techniques.monads;

import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TestMonads {
    private static Logger logger = Logger.getGlobal();

    public static void main(String[] args) {
        Optional<Integer> pseudoMonad = Optional.of(2).flatMap(f -> Optional.of(3).flatMap(s -> Optional.of(f + s)));
        logger.log(Level.INFO, String.valueOf(pseudoMonad));
    }
}
