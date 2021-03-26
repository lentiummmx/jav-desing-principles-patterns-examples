package com.globant.patterns.behavioral.mediator.mediator.impl;

import com.globant.patterns.behavioral.mediator.colleague.impl.Heater;
import com.globant.patterns.behavioral.mediator.colleague.impl.Machine;
import com.globant.patterns.behavioral.mediator.colleague.impl.Valve;
import com.globant.patterns.behavioral.mediator.mediator.MachineMediator;
import com.globant.patterns.behavioral.mediator.support.Motor;
import com.globant.patterns.behavioral.mediator.support.Sensor;
import com.globant.patterns.behavioral.mediator.support.SoilRemoval;

public class DenimMediator implements MachineMediator {
    private final Machine machine;
    private final Heater heater;
    private final Motor motor;
    private final Sensor sensor;
    private final SoilRemoval soilRemoval;
    private final Valve valve;

    public DenimMediator(Machine machine, Heater heater, Motor motor, Sensor sensor, SoilRemoval soilRemoval, Valve valve) {
        this.machine = machine;
        this.heater = heater;
        this.motor = motor;
        this.sensor = sensor;
        this.soilRemoval = soilRemoval;
        this.valve = valve;
        System.out.println("Setting up for DENIM program");
    }
    @Override
    public void start() {
        machine.start();
    }
    @Override
    public void wash() {
        motor.startMotor();
        motor.rotateDrum(1400);
        System.out.println("Adding detergent");
        soilRemoval.medium();
        System.out.println("No softener is required");
    }
    @Override
    public void open() {
        valve.open();
    }
    @Override
    public void closed() {
        valve.closed();
    }
    @Override
    public void on() {
        heater.on(30);
    }
    @Override
    public void off() {
        heater.off();
    }
    @Override
    public boolean checkTemperature(int temp) {
        return sensor.checkTemperature(temp);
    }
}
