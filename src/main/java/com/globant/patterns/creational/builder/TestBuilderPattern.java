package com.globant.patterns.creational.builder;

import com.globant.patterns.creational.builder.builder.CarBuilder;
import com.globant.patterns.creational.builder.builder.impl.SedanCarBuilder;
import com.globant.patterns.creational.builder.builder.impl.SportsCarBuilder;
import com.globant.patterns.creational.builder.director.CarDirector;
import com.globant.patterns.creational.builder.product.Car;

public class TestBuilderPattern {
    public static void main(String[] args) {
        CarBuilder carBuilder = new SedanCarBuilder();
        CarDirector director = new CarDirector(carBuilder);
        director.build();
        Car car = carBuilder.getCar();
        System.out.println(car);

        carBuilder = new SportsCarBuilder();
        director = new CarDirector(carBuilder);
        director.build();
        car = carBuilder.getCar();
        System.out.println(car);
    }
}
