package com.globant.oop.polymorphism.stattic;

public class TestBird {
    public static void main(String[] args) {
        Bird myBird = new Bird();

        myBird.fly();
        myBird.fly(10000);
        myBird.fly("eagle", 10000);
    }
}
