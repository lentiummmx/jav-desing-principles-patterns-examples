package com.globant.patterns.structural.decorator.decorator;

import com.globant.patterns.structural.decorator.component.Pizza;

public abstract class PizzaDecorator implements Pizza {
    @Override
    public String getDesc() {
        return "Toppings";
    }
}
