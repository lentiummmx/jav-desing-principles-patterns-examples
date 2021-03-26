package com.globant.patterns.behavioral.observer.publisher.impl;

import com.globant.patterns.behavioral.observer.Commentary;
import com.globant.patterns.behavioral.observer.publisher.Subject;
import com.globant.patterns.behavioral.observer.subscriber.Observer;

import java.util.List;

public class ComentaryObj implements Subject, Commentary {
    private final List<Observer> observers;
    private String desc;
    private final String subjectDetails;

    public ComentaryObj(List<Observer> observers, String subjectDetails) {
        this.observers = observers;
        this.subjectDetails = subjectDetails;
    }

    @Override
    public void setDesc(String desc) {
        this.desc = desc;
        notifyObservers();
    }

    @Override
    public void subscribeObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unSubscribeObserver(Observer observer) {
        int index = observers.indexOf(observer);
        observers.remove(index);
    }

    @Override
    public void notifyObservers() {
        System.out.println();
        for (Observer observer : observers){
            observer.update(desc);
        }
    }

    @Override
    public String subjectDetails() {
        return subjectDetails;
    }
}
