package com.globant.patterns.behavioral.command;

import com.globant.patterns.behavioral.command.command.impl.EmailJob;
import com.globant.patterns.behavioral.command.command.impl.FileIOJob;
import com.globant.patterns.behavioral.command.command.impl.LoggingJob;
import com.globant.patterns.behavioral.command.command.impl.SmsJob;
import com.globant.patterns.behavioral.command.invoker.ThreadPool;
import com.globant.patterns.behavioral.command.receiver.Email;
import com.globant.patterns.behavioral.command.receiver.FileIO;
import com.globant.patterns.behavioral.command.receiver.Logging;
import com.globant.patterns.behavioral.command.receiver.Sms;

public class TestCommandPattern {
    public static void main(String[] args) {
        init();
    }

    private static void init() {
        ThreadPool threadPool = new ThreadPool(10);

        Email email = null;
        EmailJob emailJob = new EmailJob();

        Sms sms = null;
        SmsJob smsJob = new SmsJob();

        FileIO fileIO = null;
        FileIOJob fileIOJob = new FileIOJob();

        Logging logging = null;
        LoggingJob loggingJob = new LoggingJob();

        for (int i = 0; i < 5; i++) {
            email = new Email();
            emailJob.setEmail(email);

            sms = new Sms();
            smsJob.setSms(sms);

            fileIO = new FileIO();
            fileIOJob.setFileIO(fileIO);

            logging = new Logging();
            loggingJob.setLogging(logging);

            threadPool.addJob(emailJob);
            threadPool.addJob(smsJob);
            threadPool.addJob(fileIOJob);
            threadPool.addJob(loggingJob);
        }

        threadPool.shutdownPool();
    }
}
