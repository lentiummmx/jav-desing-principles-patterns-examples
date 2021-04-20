package com.globant.oop.abstraction.example;

public abstract class SpaceShip {

    String planet;

    public abstract String name();

    public void landOnPlanet(String planet) {
        this.planet = planet;
        System.out.println("The spaceship " + name() + " landed on the planet: " + planet);
    }

    public void takeOffFromPlanet() {
        if (planet == null) {
            throw new IllegalStateException("We are currently in space!");
        }
        planet = null;
        System.out.println("The spaceship " + name() + " just took off into space");
    }
}
