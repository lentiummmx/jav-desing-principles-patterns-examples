package com.globant.patterns.structural.proxy.protection;

import com.globant.patterns.structural.proxy.protection.proxy.ReportGeneratorProxy;
import com.globant.patterns.structural.proxy.protection.proxy.impl.ReportGeneratorProtectionProxy;
import com.globant.patterns.structural.proxy.protection.support.impl.Employee;
import com.globant.patterns.structural.proxy.protection.support.impl.Owner;

public class TestProtectionProxy {
    public static void main(String[] args) {
        Owner owner = new Owner();
        ReportGeneratorProxy reportGenerator = new ReportGeneratorProtectionProxy(owner);
        owner.setReportGenerator(reportGenerator);

        Employee employee = new Employee();
        reportGenerator = new ReportGeneratorProtectionProxy(employee);
        employee.setReportGenerator(reportGenerator);

        System.out.println("For owner:");
        System.out.println(owner.generateDailyReport());
        System.out.println("For employee:");
        System.out.println(employee.generateDailyReport());
    }
}
