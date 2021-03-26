package com.globant.patterns.behavioral.command.command.impl;

import com.globant.patterns.behavioral.command.command.Job;
import com.globant.patterns.behavioral.command.receiver.FileIO;
import lombok.Setter;

public class FileIOJob implements Job {

    @Setter
    private FileIO fileIO;

    @Override
    public void run() {
        System.out.println("Job ID: " + Thread.currentThread().getId() + " executing fileIO jobs.");
        if (fileIO != null) {
            fileIO.execute();
        }

        try {
            Thread.sleep(1000);
        }catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
