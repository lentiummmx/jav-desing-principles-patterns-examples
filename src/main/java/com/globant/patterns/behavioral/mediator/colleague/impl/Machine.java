package com.globant.patterns.behavioral.mediator.colleague.impl;

import com.globant.patterns.behavioral.mediator.colleague.Colleague;
import com.globant.patterns.behavioral.mediator.mediator.MachineMediator;

public class Machine implements Colleague {
    private MachineMediator mediator;
    @Override
    public void setMediator(MachineMediator mediator){
        this.mediator = mediator;
    }
    public void start(){
        mediator.open();
    }
    public void wash(){
        mediator.wash();
    }
}
