package com.globant.patterns.behavioral.tmplt_mthd.absc.impl;

import com.globant.patterns.behavioral.tmplt_mthd.absc.ConnectionTemplate;
import com.globant.patterns.behavioral.tmplt_mthd.absc.ConnectionTemplateV2;

public class OracleTxtConV2 extends ConnectionTemplateV2 {
    @Override
    public void setData() {
        System.out.println("Setting up data from txt file...");
    }

    @Override
    public void setCredentials() {
        System.out.println("Setting credentials for Oracle DB...");
    }

    @Override
    public void setDBDriver() {
        System.out.println("Setting Oracle DB drivers...");
    }
}
