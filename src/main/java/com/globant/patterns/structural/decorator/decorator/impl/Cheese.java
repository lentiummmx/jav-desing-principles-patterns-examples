package com.globant.patterns.structural.decorator.decorator.impl;

import com.globant.patterns.structural.decorator.component.Pizza;
import com.globant.patterns.structural.decorator.decorator.PizzaDecorator;

public class Cheese extends PizzaDecorator {

    private final Pizza pizza;

    public Cheese(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public double getPrice() {
        return pizza.getPrice() + 20.72;
    }

    @Override
    public String getDesc() {
        return pizza.getDesc() + ", Cheese (20.72)";
    }
}
