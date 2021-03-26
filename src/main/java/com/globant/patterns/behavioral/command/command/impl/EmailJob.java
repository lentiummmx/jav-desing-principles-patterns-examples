package com.globant.patterns.behavioral.command.command.impl;

import com.globant.patterns.behavioral.command.command.Job;
import com.globant.patterns.behavioral.command.receiver.Email;
import lombok.Setter;

public class EmailJob implements Job {

    @Setter
    private Email email;

    @Override
    public void run() {
        System.out.println("Job ID: " + Thread.currentThread().getId() + " executing email jobs.");
        if (email != null) {
            email.sendEmail();
        }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
