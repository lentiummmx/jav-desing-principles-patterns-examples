package com.globant.patterns.creational.builder.director;

import com.globant.patterns.creational.builder.builder.CarBuilder;
import com.globant.patterns.creational.builder.product.Car;

public class CarDirector {

    private final CarBuilder carBuilder;

    public CarDirector(CarBuilder carBuilder) {
        this.carBuilder = carBuilder;
    }

    public void build(){
        carBuilder.buildBodyStyle();
        carBuilder.buildPower();
        carBuilder.buildEngine();
        carBuilder.buildBreaks();
        carBuilder.buildSeats();
        carBuilder.buildWindows();
        carBuilder.buildFuelType();
    }
}
