package com.globant.patterns.structural.facade;

public class TestFacade {
    public static void main(String[] args) {
        ScheduleServer scheduleServer = new ScheduleServer();
        ScheduleServerFacade serverFacade = new ScheduleServerFacade(scheduleServer);
        serverFacade.startServer();
        System.out.println("Start working......");
        System.out.println("After work done.........");
        serverFacade.stopServer();
    }
}
