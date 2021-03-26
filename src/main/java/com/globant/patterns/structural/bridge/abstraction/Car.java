package com.globant.patterns.structural.bridge.abstraction;

import com.globant.patterns.structural.bridge.implementor.Product;

/**
 * Abstraction
 */
public abstract class Car {
    /**
     * Bridge
     */
    private final Product product;
    private final String carType;

    protected Car(Product product, String carType) {
        this.product = product;
        this.carType = carType;
    }

    public abstract void assemble();
    public abstract void produceProduct();

    public void printDetails(){
        System.out.println("Car: " + carType + ", Product: " + product.productName());
    }
}
