package com.globant.patterns.behavioral.observer.subscriber;

public interface Observer {
    public void update(String desc);
    public void subscribe();
    public void unSubscribe();
}
