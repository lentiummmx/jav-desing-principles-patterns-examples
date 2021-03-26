package com.globant.patterns.behavioral.command.command.impl;

import com.globant.patterns.behavioral.command.command.Job;
import com.globant.patterns.behavioral.command.receiver.FileIO;
import com.globant.patterns.behavioral.command.receiver.Logging;
import lombok.Setter;

public class LoggingJob implements Job {

    @Setter
    private Logging logging;

    @Override
    public void run() {
        System.out.println("Job ID: " + Thread.currentThread().getId() + " executing logging jobs.");
        if (logging != null) {
            logging.log();
        }

        try {
            Thread.sleep(1000);
        }catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
