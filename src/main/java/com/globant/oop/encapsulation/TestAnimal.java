package com.globant.oop.encapsulation;

public class TestAnimal {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();

        myAnimal.setName("Eagle");
        myAnimal.setAverageWeeight(1.5);
        myAnimal.setNumberOfLegs(2);

        System.out.println("Name: " + myAnimal.getName());
        System.out.println("Average weight: " + myAnimal.getAverageWeeight() + "kg");
        System.out.println("Number of legs: " + myAnimal.getNumberOfLegs());
    }
}
