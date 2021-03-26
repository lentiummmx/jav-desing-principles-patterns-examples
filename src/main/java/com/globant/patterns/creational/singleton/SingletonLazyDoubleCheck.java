package com.globant.patterns.creational.singleton;

public class SingletonLazyDoubleCheck {
    private volatile static SingletonLazyDoubleCheck sc = null;
    private static final Object mutex = new Object();
    private SingletonLazyDoubleCheck(){}
    public static SingletonLazyDoubleCheck getInstance(){
        if(sc==null){
            // synchronized(SingletonLazyDoubleCheck.class){
            synchronized(mutex){
                if(sc==null){
                    sc = new SingletonLazyDoubleCheck();
                }
            }
        }
        return sc;
    }
}
