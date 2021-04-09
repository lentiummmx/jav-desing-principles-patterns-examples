package com.globant.func_prog.ref_transparency;

import java.util.logging.Level;
import java.util.logging.Logger;

public class TestSimpleData {
    private static Logger logger = Logger.getGlobal();

    public static void main(String[] args) {
        String data  = new SimpleData().setData("Morales").getData();
        logger.log(Level.INFO, new SimpleData().setData("Morales").getData());
        logger.log(Level.INFO, data);
        logger.log(Level.INFO, "Morales");
    }
}
