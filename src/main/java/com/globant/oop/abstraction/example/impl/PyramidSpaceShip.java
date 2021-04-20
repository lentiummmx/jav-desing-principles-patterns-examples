package com.globant.oop.abstraction.example.impl;

import com.globant.oop.abstraction.example.LazerShooter;
import com.globant.oop.abstraction.example.SpaceShip;

public class PyramidSpaceShip extends SpaceShip implements LazerShooter {
    @Override
    public String name() {
        return "Cute Pyramid SpaceShip";
    }

    public void avoidingAsteroids() {
        System.out.println("Avoiding asteroids");
    }
}
