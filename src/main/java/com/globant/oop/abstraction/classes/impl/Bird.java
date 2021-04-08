package com.globant.oop.abstraction.classes.impl;

import com.globant.oop.abstraction.classes.Animal;

public class Bird extends Animal {

    @Override
    protected void move() {
        System.out.println("Moves by flying...");
    }

    @Override
    protected void eat() {
        System.out.println("Eats birdfood...");
    }
}
