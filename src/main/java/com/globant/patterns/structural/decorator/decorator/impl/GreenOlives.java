package com.globant.patterns.structural.decorator.decorator.impl;

import com.globant.patterns.structural.decorator.component.Pizza;
import com.globant.patterns.structural.decorator.decorator.PizzaDecorator;

public class GreenOlives extends PizzaDecorator {

    private final Pizza pizza;

    public GreenOlives(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public double getPrice() {
        return pizza.getPrice() + 5.47;
    }

    @Override
    public String getDesc() {
        return pizza.getDesc() + ", Green Olives (5.47)";
    }
}
