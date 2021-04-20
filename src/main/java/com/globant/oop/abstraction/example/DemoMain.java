package com.globant.oop.abstraction.example;

import com.globant.oop.abstraction.example.impl.PyramidSpaceShip;
import com.globant.oop.abstraction.example.impl.RoundSpaceShip;

public class DemoMain {
    public static void main(String[] args) {
        PyramidSpaceShip pyramidSpaceShip = new PyramidSpaceShip();

        pyramidSpaceShip.avoidingAsteroids();
        pyramidSpaceShip.landOnPlanet("Mars");
        pyramidSpaceShip.takeOffFromPlanet();
        pyramidSpaceShip.shoot();
        pyramidSpaceShip.reload();
        pyramidSpaceShip.safetyOn();

        System.out.println("----------");

        RoundSpaceShip roundSpaceShip = new RoundSpaceShip();

        roundSpaceShip.landOnPlanet("Pluto");
        roundSpaceShip.takeOffFromPlanet();
        roundSpaceShip.loadIntoCargoSpace("Tomatoes");
        String s = roundSpaceShip.unloadStuff();
        System.out.println("We got " + s + " unloaded!");
        roundSpaceShip.shoot();
        roundSpaceShip.reload();
        roundSpaceShip.safetyOn();
    }
}
