package com.globant.patterns.structural.proxy.protection.support.impl;

import com.globant.patterns.structural.proxy.protection.proxy.ReportGeneratorProxy;
import com.globant.patterns.structural.proxy.protection.support.Staff;

public class Employee implements Staff {

    private ReportGeneratorProxy reportGenerator;

    @Override
    public boolean isOwner() {
        return false;
    }

    @Override
    public void setReportGenerator(ReportGeneratorProxy reportGenerator) {
        this.reportGenerator = reportGenerator;
    }

    public String generateDailyReport(){
        try {
            return reportGenerator.generateDailyReport();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }
}
