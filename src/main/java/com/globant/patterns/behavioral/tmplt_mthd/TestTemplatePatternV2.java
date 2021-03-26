package com.globant.patterns.behavioral.tmplt_mthd;

import com.globant.patterns.behavioral.tmplt_mthd.absc.ConnectionTemplate;
import com.globant.patterns.behavioral.tmplt_mthd.absc.ConnectionTemplateV2;
import com.globant.patterns.behavioral.tmplt_mthd.absc.impl.MySqLCSVConV2;
import com.globant.patterns.behavioral.tmplt_mthd.absc.impl.OracleTxtConV2;

public class TestTemplatePatternV2 {
    public static void main(String[] args) {
        System.out.println("For MYSQL....");
        ConnectionTemplateV2 template = new MySqLCSVConV2();
        template.run();
        System.out.println("For Oracle...");
        template = new OracleTxtConV2();
        template.run();
    }
}
