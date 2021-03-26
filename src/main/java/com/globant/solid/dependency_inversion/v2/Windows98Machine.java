package com.globant.solid.dependency_inversion.v2;

import com.globant.solid.dependency_inversion.v2.intfc.Keyboard;
import com.globant.solid.dependency_inversion.v2.intfc.Monitor;

public class Windows98Machine {

    private final Keyboard keyboard;
    private final Monitor monitor;

    public Windows98Machine(Keyboard keyboard, Monitor monitor) {
        this.keyboard = keyboard;
        this.monitor = monitor;
    }
}
