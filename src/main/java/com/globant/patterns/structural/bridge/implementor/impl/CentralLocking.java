package com.globant.patterns.structural.bridge.implementor.impl;

import com.globant.patterns.structural.bridge.implementor.Product;

/**
 * ConcreteImplementor
 */
public class CentralLocking implements Product {
    private final String productName;

    public CentralLocking(String productName) {
        this.productName = productName;
    }

    @Override
    public String productName() {
        return productName;
    }

    @Override
    public void produce() {
        System.out.println("Producing Central Locking System");
    }
}
