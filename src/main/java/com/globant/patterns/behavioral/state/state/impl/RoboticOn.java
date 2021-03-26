package com.globant.patterns.behavioral.state.state.impl;

import com.globant.patterns.behavioral.state.context.Robot;
import com.globant.patterns.behavioral.state.state.RoboticState;

public class RoboticOn implements RoboticState {
    private final Robot robot;

    public RoboticOn(Robot robot) {
        this.robot = robot;
    }

    @Override
    public void walk() {
        System.out.println("Walking...");
    }

    @Override
    public void cook() {
        System.out.println("Cooking...");
        robot.setRoboticState(robot.getRoboticCook());
    }

    @Override
    public void off() {
        robot.setRoboticState(robot.getRoboticOff());
        System.out.println("Robot is switched off");
    }
}
