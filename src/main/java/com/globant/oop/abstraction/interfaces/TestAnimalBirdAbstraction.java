package com.globant.oop.abstraction.interfaces;

import com.globant.oop.abstraction.interfaces.impl.Eagle;

public class TestAnimalBirdAbstraction {
    public static void main(String[] args) {
        Eagle myEagle = new Eagle();

        myEagle.eat();
        myEagle.sound();
        myEagle.fly();

        System.out.println("Number of legs: " + myEagle.numberOfLegs);
        System.out.println("Outer covering: " + myEagle.outerCovering);
    }
}
