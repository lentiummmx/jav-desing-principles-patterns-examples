package com.globant.patterns.structural.decorator.component.impl;

import com.globant.patterns.structural.decorator.component.Pizza;

public class SimplyVeggyPizza implements Pizza {
    @Override
    public String getDesc() {
        return "SimplyVeggyPizza (230)";
    }

    @Override
    public double getPrice() {
        return 230;
    }
}
