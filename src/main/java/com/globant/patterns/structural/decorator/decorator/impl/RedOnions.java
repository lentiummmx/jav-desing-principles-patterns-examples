package com.globant.patterns.structural.decorator.decorator.impl;

import com.globant.patterns.structural.decorator.component.Pizza;
import com.globant.patterns.structural.decorator.decorator.PizzaDecorator;

public class RedOnions extends PizzaDecorator {

    private final Pizza pizza;

    public RedOnions(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public double getPrice() {
        return pizza.getPrice() + 3.75;
    }

    @Override
    public String getDesc() {
        return pizza.getDesc() + ", Red Onions (3.75)";
    }
}
