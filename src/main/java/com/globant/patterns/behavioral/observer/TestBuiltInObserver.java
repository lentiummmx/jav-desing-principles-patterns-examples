package com.globant.patterns.behavioral.observer;

import com.globant.patterns.behavioral.observer.publisher.builtin.CommentaryObjectObservable;
import com.globant.patterns.behavioral.observer.subscriber.builtin.SMSUserObserver;

public class TestBuiltInObserver {
    public static void main(String[] args) {
        CommentaryObjectObservable obj = new CommentaryObjectObservable("Soccer Match [2014AUG24]");
        SMSUserObserver observer = new SMSUserObserver(obj, "Adam Warner [NY]");
        SMSUserObserver observer2 = new SMSUserObserver(obj, "Tim Ronney [LND]");
        observer.subscribe();
        observer2.subscribe();

        obj.setDesc("Welcome to live Soccer match");
        obj.setDesc("Current score 0-0");

        observer.unSubscribe();

        obj.setDesc("It’s a goal!!");
        obj.setDesc("Current score 1-0");
    }
}
