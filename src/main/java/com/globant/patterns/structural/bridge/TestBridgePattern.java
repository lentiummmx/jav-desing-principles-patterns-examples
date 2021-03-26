package com.globant.patterns.structural.bridge;

import com.globant.patterns.structural.bridge.abstraction.Car;
import com.globant.patterns.structural.bridge.abstraction.impl.BigWheel;
import com.globant.patterns.structural.bridge.abstraction.impl.Motoren;
import com.globant.patterns.structural.bridge.implementor.Product;
import com.globant.patterns.structural.bridge.implementor.impl.CentralLocking;
import com.globant.patterns.structural.bridge.implementor.impl.GearLocking;

public class TestBridgePattern {
    public static void main(String[] args) {
        Product product = new CentralLocking("Central Locking System");
        Product product2 = new GearLocking("Gear Locking System");

        Car car = new BigWheel(product, "BigWheel xz model");
        car.produceProduct();
        car.assemble();
        car.printDetails();

        System.out.println();

        car = new BigWheel(product2 , "BigWheel xz model");
        car.produceProduct();
        car.assemble();
        car.printDetails();

        System.out.println();

        car = new Motoren(product, "Motoren lm model");
        car.produceProduct();
        car.assemble();
        car.printDetails();

        System.out.println();

        car = new Motoren(product2, "Motoren lm model");
        car.produceProduct();
        car.assemble();
        car.printDetails();
    }
}
