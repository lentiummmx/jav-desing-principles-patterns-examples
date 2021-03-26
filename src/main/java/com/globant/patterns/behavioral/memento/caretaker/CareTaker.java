package com.globant.patterns.behavioral.memento.caretaker;

import com.globant.patterns.behavioral.memento.memento.Memento;

import java.util.HashMap;
import java.util.Map;

public class CareTaker {

    private final Map<String, Memento> savepointStorage =  new HashMap<>();

    public void saveMemento(Memento memento, String savepointName) {
        System.out.println("Saving state ... " + savepointName);
        savepointStorage.put(savepointName, memento);
    }

    public Memento getMemento(String savepointName) {
        System.out.println("undo at  ... " + savepointName);
        return savepointStorage.get(savepointName);
    }

    public void clearSavepoints(){
        System.out.println("Clearing all save points ...");
        savepointStorage.clear();
    }
}
