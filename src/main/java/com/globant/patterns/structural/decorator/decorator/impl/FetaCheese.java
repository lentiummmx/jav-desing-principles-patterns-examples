package com.globant.patterns.structural.decorator.decorator.impl;

import com.globant.patterns.structural.decorator.component.Pizza;
import com.globant.patterns.structural.decorator.decorator.PizzaDecorator;

public class FetaCheese extends PizzaDecorator {

    private final Pizza pizza;

    public FetaCheese(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public double getPrice() {
        return pizza.getPrice() + 25.88;
    }

    @Override
    public String getDesc() {
        return pizza.getDesc() + ", Feta Cheese (25.88)";
    }
}
