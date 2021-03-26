package com.globant.patterns.behavioral.state.context;

import com.globant.patterns.behavioral.state.state.RoboticState;
import com.globant.patterns.behavioral.state.state.impl.RoboticCook;
import com.globant.patterns.behavioral.state.state.impl.RoboticOff;
import com.globant.patterns.behavioral.state.state.impl.RoboticOn;
import com.globant.patterns.behavioral.state.state.impl.RoboticStandby;
import lombok.Data;

@Data
public class Robot implements RoboticState {

    private RoboticState roboticOn;
    private RoboticState roboticCook;
    private RoboticState roboticOff;
    private RoboticState roboticStandby;

    private RoboticState state;

    public Robot() {
        this.roboticOn = new RoboticOn(this);
        this.roboticCook = new RoboticCook(this);
        this.roboticOff = new RoboticOff(this);
        this.roboticStandby = new RoboticStandby(this);
        this.state = roboticOn;
    }

    public void setRoboticState(RoboticState state) {
        this.state = state;
    }

    @Override
    public void walk() {
        state.walk();
        setState(getRoboticStandby());
    }

    @Override
    public void cook() {
        state.cook();
        setState(getRoboticStandby());
    }

    @Override
    public void off() {
        state.off();
    }
}
