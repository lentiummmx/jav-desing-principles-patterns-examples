package com.globant.patterns.structural.proxy.protection.support;

import com.globant.patterns.structural.proxy.protection.proxy.ReportGeneratorProxy;

public interface Staff {
    public boolean isOwner();
    public void setReportGenerator(ReportGeneratorProxy reportGenerator);
}
