package com.globant.patterns.structural.decorator;

import com.globant.patterns.structural.decorator.component.Pizza;
import com.globant.patterns.structural.decorator.component.impl.SimplyNonVeggyPizza;
import com.globant.patterns.structural.decorator.component.impl.SimplyVeggyPizza;
import com.globant.patterns.structural.decorator.decorator.impl.*;

import java.text.DecimalFormat;

public class TestDecoratorPattern {
    public static void main(String[] args) {
        DecimalFormat dFormat = new DecimalFormat("#.##");

        Pizza pizza = new SimplyVeggyPizza();
        pizza = new RomaTomatoes(pizza);
        pizza = new GreenOlives(pizza);
        pizza = new Spinach(pizza);

        System.out.println("Desc: " + pizza.getDesc());
        System.out.println("Price: " + dFormat.format(pizza.getPrice()));

        pizza = new SimplyNonVeggyPizza();
        pizza = new Meat(pizza);
        pizza = new Cheese(pizza);
        pizza = new Cheese(pizza);
        pizza = new Ham(pizza);

        System.out.println("Desc: " + pizza.getDesc());
        System.out.println("Price: " + dFormat.format(pizza.getPrice()));
    }
}
