package com.globant.solid.liskov_substitution.intfc.impl;

import com.globant.solid.liskov_substitution.intfc.Car;

/**
 * By throwing a car without an engine into the mix, we are inherently changing the behavior of our
 * program. This is a blatant violation of Liskov substitution and is a bit harder to fix than our
 * previous 2 principles: Single_responsibility & open_to_extension-closed_to_modification.
 *
 * Possible solution would be to rework our model into interfaces that take into account
 * the engine-less state of our Car.
 */
public class ElectricCar implements Car {
    @Override
    public void turnOnEngine() {
        throw new AssertionError("I do not have an engine");
    }

    @Override
    public void accelerate() {
        // this acceleration is crazy!
    }
}
