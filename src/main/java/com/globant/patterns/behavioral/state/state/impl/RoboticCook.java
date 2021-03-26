package com.globant.patterns.behavioral.state.state.impl;

import com.globant.patterns.behavioral.state.context.Robot;
import com.globant.patterns.behavioral.state.state.RoboticState;

public class RoboticCook implements RoboticState {
    private final Robot robot;

    public RoboticCook(Robot robot) {
        this.robot = robot;
    }

    @Override
    public void walk() {
        System.out.println("Walking...");
        robot.setRoboticState(robot.getRoboticOn());
    }

    @Override
    public void cook() {
        System.out.println("Cooking...");
    }

    @Override
    public void off() {
        System.out.println("Cannot switched off while cooking...");
    }
}
