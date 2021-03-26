package com.globant.patterns.behavioral.mediator;

import com.globant.patterns.behavioral.mediator.colleague.impl.Button;
import com.globant.patterns.behavioral.mediator.colleague.impl.Heater;
import com.globant.patterns.behavioral.mediator.colleague.impl.Machine;
import com.globant.patterns.behavioral.mediator.colleague.impl.Valve;
import com.globant.patterns.behavioral.mediator.mediator.MachineMediator;
import com.globant.patterns.behavioral.mediator.mediator.impl.CottonMediator;
import com.globant.patterns.behavioral.mediator.mediator.impl.DenimMediator;
import com.globant.patterns.behavioral.mediator.support.Motor;
import com.globant.patterns.behavioral.mediator.support.Sensor;
import com.globant.patterns.behavioral.mediator.support.SoilRemoval;

public class TestMediator {
    public static void main(String[] args) {
        MachineMediator mediator = null;
        Sensor sensor = new Sensor();
        SoilRemoval soilRemoval = new SoilRemoval();
        Motor motor = new Motor();
        Machine machine = new Machine();
        Heater heater = new Heater();
        Valve valve = new Valve();
        Button button = new Button();

        mediator = new CottonMediator(machine, heater, motor, sensor, soilRemoval, valve);

        button.setMediator(mediator);
        machine.setMediator(mediator);
        heater.setMediator(mediator);
        valve.setMediator(mediator);

        button.press();

        System.out.println();

        mediator = new DenimMediator(machine, heater, motor, sensor, soilRemoval, valve);

        button.setMediator(mediator);
        machine.setMediator(mediator);
        heater.setMediator(mediator);
        valve.setMediator(mediator);

        button.press();
    }
}
