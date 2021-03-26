package com.globant.patterns.structural.decorator.decorator.impl;

import com.globant.patterns.structural.decorator.component.Pizza;
import com.globant.patterns.structural.decorator.decorator.PizzaDecorator;

public class RomaTomatoes extends PizzaDecorator {

    private final Pizza pizza;

    public RomaTomatoes(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public double getPrice() {
        return pizza.getPrice() + 5.20;
    }

    @Override
    public String getDesc() {
        return pizza.getDesc() + ", Roma Tomatoes (5.20)";
    }
}
