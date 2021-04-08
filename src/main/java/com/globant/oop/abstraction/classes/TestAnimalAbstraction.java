package com.globant.oop.abstraction.classes;

import com.globant.oop.abstraction.classes.impl.Bird;
import com.globant.oop.abstraction.classes.impl.Fish;

public class TestAnimalAbstraction {
    public static void main(String[] args) {
        Animal myBird = new Bird();
        myBird.label();
        myBird.move();
        myBird.eat();

        Animal myFish = new Fish();
        myFish.label();
        myFish.move();
        myFish.eat();
    }
}
