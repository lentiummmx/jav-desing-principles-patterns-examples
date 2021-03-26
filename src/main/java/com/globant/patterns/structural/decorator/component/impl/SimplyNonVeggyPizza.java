package com.globant.patterns.structural.decorator.component.impl;

import com.globant.patterns.structural.decorator.component.Pizza;

public class SimplyNonVeggyPizza implements Pizza {
    @Override
    public String getDesc() {
        return "SimplyNonVeggyPizza (350)";
    }

    @Override
    public double getPrice() {
        return 350;
    }
}
