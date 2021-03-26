package com.globant.patterns.behavioral.tmplt_mthd.absc;

public abstract class ConnectionTemplate {

    public final void run(){
        setDBDriver();
        setCredentials();
        connect();
        prepareStatement();
        setData();
        insert();
        close();
        destroy();
    }

    public abstract void setData();

    public abstract void setCredentials();

    public abstract void setDBDriver();

    public void connect() {
        System.out.println("Setting connection ...");
    }

    public void prepareStatement() {
        System.out.println("Preparing insert statement ...");
    }

    public void insert() {
        System.out.println("Inserting data ...");
    }

    public void close() {
        System.out.println("Closing connections ...");
    }

    public void destroy() {
        System.out.println("Destroying connection objects ...");
    }
}
