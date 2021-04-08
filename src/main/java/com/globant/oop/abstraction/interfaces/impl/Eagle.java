package com.globant.oop.abstraction.interfaces.impl;

import com.globant.oop.abstraction.interfaces.Animal;
import com.globant.oop.abstraction.interfaces.Bird;

public class Eagle implements Animal, Bird {
    @Override
    public void eat() {
        System.out.println("Eats reptiles and amphibians...");
    }

    @Override
    public void sound() {
        System.out.println("Has a high-pitched whistling sound...");
    }

    @Override
    public void fly() {
        System.out.println("Flies up to 10,000 feet..");
    }
}
