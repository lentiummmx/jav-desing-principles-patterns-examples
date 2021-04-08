package com.globant.oop.abstraction.classes.impl;

import com.globant.oop.abstraction.classes.Animal;

public class Fish extends Animal {
    @Override
    protected void move() {
        System.out.println("Moves by swimming...");
    }

    @Override
    protected void eat() {
        System.out.println("Eats seafood...");
    }
}
