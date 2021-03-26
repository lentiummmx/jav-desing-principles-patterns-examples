package com.globant.patterns.structural.decorator.decorator.impl;

import com.globant.patterns.structural.decorator.component.Pizza;
import com.globant.patterns.structural.decorator.decorator.PizzaDecorator;

public class Chicken extends PizzaDecorator {

    private final Pizza pizza;

    public Chicken(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public double getPrice() {
        return pizza.getPrice() + 12.75;
    }

    @Override
    public String getDesc() {
        return pizza.getDesc() + ", Chicken (12.75)";
    }
}
