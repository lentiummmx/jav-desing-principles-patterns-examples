package com.globant.patterns.behavioral.mediator.support;

import com.globant.patterns.behavioral.mediator.colleague.Colleague;

public class Motor {
    public void startMotor(){
        System.out.println("Start motor...");
    }
    public void rotateDrum(int rpm){
        System.out.println("Rotating drum at " + rpm + " rpm.");
    }
}
