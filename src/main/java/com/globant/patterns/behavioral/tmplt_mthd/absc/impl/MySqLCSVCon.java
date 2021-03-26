package com.globant.patterns.behavioral.tmplt_mthd.absc.impl;

import com.globant.patterns.behavioral.tmplt_mthd.absc.ConnectionTemplate;

public class MySqLCSVCon extends ConnectionTemplate {
    @Override
    public void setData() {
        System.out.println("Setting up data from csv file...");
    }

    @Override
    public void setCredentials() {
        System.out.println("Setting credentials for MySQL DB ...");
    }

    @Override
    public void setDBDriver() {
        System.out.println("Setting MySQL DB drivers...");
    }
}
