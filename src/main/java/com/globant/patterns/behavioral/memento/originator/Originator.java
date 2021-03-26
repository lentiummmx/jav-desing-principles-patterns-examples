package com.globant.patterns.behavioral.memento.originator;

import com.globant.patterns.behavioral.memento.caretaker.CareTaker;
import com.globant.patterns.behavioral.memento.memento.Memento;
import lombok.Data;

@Data
public class Originator {

    private double x;
    private double y;

    private String lastUndoSavepoint;
    CareTaker careTaker;

    public Originator(double x, double y, CareTaker careTaker) {
        this.x = x;
        this.y = y;
        this.careTaker = careTaker;
        createSavepoint("INITIAL");
    }

    public void createSavepoint(String savepointName) {
        careTaker.saveMemento(new Memento(this.x, this.y), savepointName);
        lastUndoSavepoint = savepointName;
    }

    public void undo(){
        setOriginatorState(lastUndoSavepoint);
    }

    public void undo(String savepointName){
        setOriginatorState(savepointName);
    }

    public void undoAll(){
        setOriginatorState("INITIAL");
        careTaker.clearSavepoints();
    }

    private void setOriginatorState(String savepointName) {
        Memento memento = careTaker.getMemento(savepointName);
        this.x = memento.getX();
        this.y = memento.getY();
    }
}
