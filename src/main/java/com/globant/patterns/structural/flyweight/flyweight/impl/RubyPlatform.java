package com.globant.patterns.structural.flyweight.flyweight.impl;

import com.globant.patterns.structural.flyweight.support.Code;
import com.globant.patterns.structural.flyweight.flyweight.Platform;

public class RubyPlatform implements Platform {
    public RubyPlatform() {
        System.out.println("RubyPlatform object created");
    }

    @Override
    public void execute(Code code) {
        System.out.println("Compiling and executing Ruby code.");
    }
}
