package com.globant.patterns.behavioral.command.command.impl;

import com.globant.patterns.behavioral.command.command.Job;
import com.globant.patterns.behavioral.command.receiver.FileIO;
import com.globant.patterns.behavioral.command.receiver.Sms;
import lombok.Setter;

public class SmsJob implements Job {

    @Setter
    private Sms sms;

    @Override
    public void run() {
        System.out.println("Job ID: " + Thread.currentThread().getId() + " executing sms jobs.");
        if (sms != null) {
            sms.sendSms();
        }

        try {
            Thread.sleep(1000);
        }catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
