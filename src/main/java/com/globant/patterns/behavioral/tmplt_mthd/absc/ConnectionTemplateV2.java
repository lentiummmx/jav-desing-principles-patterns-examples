package com.globant.patterns.behavioral.tmplt_mthd.absc;

import java.util.Date;

public abstract class ConnectionTemplateV2 {

    private boolean isLoggingEnable = true;

    public ConnectionTemplateV2() {
        this.isLoggingEnable = disableLogging();
    }

    public final void run(){
        setDBDriver();
        logging("Drivers set [" + new Date() + "]");
        setCredentials();
        logging("Credentials set [" + new Date() + "]");
        connect();
        logging("Connected [" + new Date() + "]");
        prepareStatement();
        logging("Statement prepared [" + new Date() + "]");
        setData();
        logging("Data set [" + new Date() + "]");
        insert();
        logging("Inserted [" + new Date() + "]");
        close();
        logging("Connections closed [" + new Date() + "]");
        destroy();
        logging("Object destroyed [" + new Date() + "]");
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

    public boolean disableLogging() {
        return true;
    }

    private void logging(String msg) {
        if (isLoggingEnable) {
            System.out.println("Logging...: " + msg);
        }
    }
}
