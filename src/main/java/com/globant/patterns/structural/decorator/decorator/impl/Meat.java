package com.globant.patterns.structural.decorator.decorator.impl;

import com.globant.patterns.structural.decorator.component.Pizza;
import com.globant.patterns.structural.decorator.decorator.PizzaDecorator;

public class Meat extends PizzaDecorator {

    private final Pizza pizza;

    public Meat(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public double getPrice() {
        return pizza.getPrice() + 14.25;
    }

    @Override
    public String getDesc() {
        return pizza.getDesc() + ", Meat (14.25)";
    }
}
