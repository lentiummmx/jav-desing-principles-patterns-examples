package com.globant.patterns.behavioral.observer.subscriber.builtin;

import com.globant.patterns.behavioral.observer.publisher.builtin.CommentaryObjectObservable;

import java.util.Observable;
import java.util.Observer;

public class SMSUserObserver implements Observer {
    private String desc;
    private final String userInfo;
    private final Observable observable;

    public SMSUserObserver(Observable observable, String userInfo) {
        this.userInfo = userInfo;
        this.observable = observable;
    }

    public void subscribe(){
        System.out.println("Subscribing " + userInfo + " to " + ((CommentaryObjectObservable)(observable)).subjectDetails() + " ...");
        this.observable.addObserver(this);
        System.out.println("Subscribed successfully.");
    }

    public void unSubscribe(){
        System.out.println("Unsubscribing " + userInfo + " to " + ((CommentaryObjectObservable)(observable)).subjectDetails() + " ...");
        this.observable.deleteObserver(this);
        System.out.println("Unsubscribed successfully.");
    }


    @Override
    public void update(Observable o, Object arg) {
        desc = (String) arg;
        display();
    }

    private void display() {
        System.out.println("[" + userInfo + "]: " + desc);
    }
}
