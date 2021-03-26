package com.globant.patterns.structural.decorator.decorator.impl;

import com.globant.patterns.structural.decorator.component.Pizza;
import com.globant.patterns.structural.decorator.decorator.PizzaDecorator;

public class Broccoli extends PizzaDecorator {

    private final Pizza pizza;

    public Broccoli(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public double getPrice() {
        return pizza.getPrice() + 9.25;
    }

    @Override
    public String getDesc() {
        return pizza.getDesc() + ", Broccoli (9.25)";
    }
}
