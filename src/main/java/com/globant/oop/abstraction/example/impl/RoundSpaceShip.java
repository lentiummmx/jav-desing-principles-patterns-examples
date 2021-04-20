package com.globant.oop.abstraction.example.impl;

import com.globant.oop.abstraction.example.LazerShooter;
import com.globant.oop.abstraction.example.SpaceShip;
import com.globant.oop.abstraction.example.Transport;

public class RoundSpaceShip extends SpaceShip implements LazerShooter, Transport  {

    private String stuff;

    @Override
    public String name() {
        return "Round and smooth SpaceShip";
    }

    @Override
    public String shoot() {
        System.out.println("We're shooting");
        return "phewwwww";
    }

    @Override
    public void reload() {
        System.out.println("Reloading...");
    }

    @Override
    public void loadIntoCargoSpace(String stuff) {
        this.stuff = stuff;
        System.out.println("Loading stuff: " + stuff);
    }

    @Override
    public String unloadStuff() {
        String localVar = stuff;
        stuff = null;
        System.out.println("Unloading stuff: " + localVar);
        return localVar;
    }
}
