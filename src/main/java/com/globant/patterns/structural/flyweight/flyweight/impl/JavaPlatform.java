package com.globant.patterns.structural.flyweight.flyweight.impl;

import com.globant.patterns.structural.flyweight.support.Code;
import com.globant.patterns.structural.flyweight.flyweight.Platform;

public class JavaPlatform implements Platform {
    public JavaPlatform() {
        System.out.println("JavaPlatform object created");
    }

    @Override
    public void execute(Code code) {
        System.out.println("Compiling and executing Java code.");
    }
}
