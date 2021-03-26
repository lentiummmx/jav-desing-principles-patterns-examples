package com.globant.solid.liskov_substitution.intfc.impl;

import com.globant.solid.liskov_substitution.intfc.Car;
import com.globant.solid.liskov_substitution.intfc.Engine;
import lombok.Data;

@Data
public class MotorCar implements Car {

    private Engine engine;

    // constructors, getters + setters

    @Override
    public void turnOnEngine() {
        // turn on the engine
        engine.on();
    }

    @Override
    public void accelerate() {
        // move forward
        engine.powerOn();
    }
}
