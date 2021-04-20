package com.globant.oop.abstraction.example;

import com.globant.oop.abstraction.example.impl.PyramidSpaceShip;
import com.globant.oop.abstraction.example.impl.RoundSpaceShip;

public class DemoMain {
    public static void main(String[] args) {
        PyramidSpaceShip pyramidSpaceShip = new PyramidSpaceShip();
        RoundSpaceShip roundSpaceShip = new RoundSpaceShip();

        pyramidSpaceShip.avoidingAsteroids();
        pyramidSpaceShip.landOnPlanet("Mars");
        pyramidSpaceShip.takeOffFromPlanet();

        roundSpaceShip.landOnPlanet("Pluto");
        roundSpaceShip.takeOffFromPlanet();
        roundSpaceShip.loadIntoCargoSpace("Tomatoes");
        String s = roundSpaceShip.unloadStuff();
        System.out.println("We got " + s + " unloaded!");
        roundSpaceShip.shoot();
        roundSpaceShip.reload();
    }
}
