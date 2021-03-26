package com.globant.patterns.creational.obj_pool;

import lombok.Data;

@Data
public class ExportingProcess {

    private long processNo;

    public ExportingProcess(long processNo) {
        this.processNo = processNo;
        System.out.println("Object with process no. " + processNo + " was created");
    }

}
