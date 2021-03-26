package com.globant.patterns.behavioral.tmplt_mthd;

import com.globant.patterns.behavioral.tmplt_mthd.absc.ConnectionTemplate;
import com.globant.patterns.behavioral.tmplt_mthd.absc.impl.MySqLCSVCon;
import com.globant.patterns.behavioral.tmplt_mthd.absc.impl.OracleTxtCon;

public class TestTemplatePattern {
    public static void main(String[] args) {
        System.out.println("For MySQL...");
        ConnectionTemplate template = new MySqLCSVCon();
        template.run();
        System.out.println("For Oracle...");
        template = new OracleTxtCon();
        template.run();
    }
}
