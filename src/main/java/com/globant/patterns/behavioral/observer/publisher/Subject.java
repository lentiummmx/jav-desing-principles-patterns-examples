package com.globant.patterns.behavioral.observer.publisher;

import com.globant.patterns.behavioral.observer.subscriber.Observer;

public interface Subject {
    public void subscribeObserver(Observer observer);
    public void unSubscribeObserver(Observer observer);
    public void notifyObservers();
    public String subjectDetails();
}
