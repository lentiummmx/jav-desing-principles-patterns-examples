package com.globant.patterns.behavioral.observer;

import com.globant.patterns.behavioral.observer.publisher.Subject;
import com.globant.patterns.behavioral.observer.publisher.impl.ComentaryObj;
import com.globant.patterns.behavioral.observer.subscriber.Observer;
import com.globant.patterns.behavioral.observer.subscriber.impl.SMSUser;

import java.util.ArrayList;

public class TestObserver {
    public static void main(String[] args) {
        Subject subject = new ComentaryObj(new ArrayList<Observer>(), "Soccer Match [2014AUG24]");
        Observer observer = new SMSUser(subject, "Adam Warner [New York]");
        observer.subscribe();

        System.out.println();

        Observer observer2 = new SMSUser(subject, "Tim Ronney [London]");
        observer2.subscribe();

        Commentary commentary = (Commentary) subject;
        commentary.setDesc("Welcome to live Soccer match");
        commentary.setDesc("Current score 0-0");

        System.out.println();

        observer2.unSubscribe();

        System.out.println();

        commentary.setDesc("It’s a goal!!");
        commentary.setDesc("Current score 1-0");

        System.out.println();

        Observer observer3 = new SMSUser(subject, "Marrie [Paris]");
        observer3.subscribe();

        System.out.println();

        commentary.setDesc("It’s another goal!!");
        commentary.setDesc("Half-time score 2-0");
    }
}
