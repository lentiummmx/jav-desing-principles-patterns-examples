package com.globant.oop.abstraction.classes;

public abstract class Animal {

    // abstract methods
    protected abstract void move();
    protected abstract void eat();

    // concrete method
    void label() {
        System.out.println("Animal's data:");
    }
}
