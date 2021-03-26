package com.globant.patterns.structural.proxy.protection.proxy.impl;

import com.globant.patterns.structural.proxy.protection.proxy.ReportGeneratorProxy;
import com.globant.patterns.structural.proxy.protection.support.Staff;
import com.globant.patterns.structural.proxy.remote.proxy.ReportGenerator;

import java.rmi.Naming;

public class ReportGeneratorProtectionProxy implements ReportGeneratorProxy {

    ReportGenerator reportGenerator;
    Staff staff;

    public ReportGeneratorProtectionProxy(Staff staff) {
        this.staff = staff;
    }

    @Override
    public String generateDailyReport() {
        if (staff.isOwner()){
            ReportGenerator reportGenerator = null;
            try {
                reportGenerator = (ReportGenerator) Naming.lookup("rmi://127.0.0.1/PizzaCoRemoteGenerator");
                return reportGenerator.generateDailyReport();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return "";
        } else {
            return "Not Autorized to view report.";
        }
    }
}
