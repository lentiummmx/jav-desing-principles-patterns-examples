package com.globant.oop.abstraction.example;

public interface LazerShooter {

    default String shoot() {
        String shoot = "Phewww bang bang buumm";
        System.out.println(shoot);
        return shoot;
    }

    default void reload() {
        System.out.println("Reloading...");
    }

    default void safetyOn() {
        System.out.println("The safety is now on!");
    }

}
