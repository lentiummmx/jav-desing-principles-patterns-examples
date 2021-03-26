package com.globant.patterns.structural.decorator.decorator.impl;

import com.globant.patterns.structural.decorator.component.Pizza;
import com.globant.patterns.structural.decorator.decorator.PizzaDecorator;

public class Spinach extends PizzaDecorator {

    private final Pizza pizza;

    public Spinach(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public double getPrice() {
        return pizza.getPrice() + 7.92;
    }

    @Override
    public String getDesc() {
        return pizza.getDesc() + ", Spinach (7.92)";
    }
}
