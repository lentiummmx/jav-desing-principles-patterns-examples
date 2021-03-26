package com.globant.patterns.behavioral.tmplt_mthd.absc.impl;

import com.globant.patterns.behavioral.tmplt_mthd.absc.ConnectionTemplateV2;

public class MySqLCSVConV2 extends ConnectionTemplateV2 {
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

    @Override
    public boolean disableLogging() {
        return false;
    }
}
