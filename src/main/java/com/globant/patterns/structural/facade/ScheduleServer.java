package com.globant.patterns.structural.facade;

/**
 * Subsystem
 */
public class ScheduleServer {
    public void startBooting() {
        System.out.println("Executing: startBooting");
    }

    public void readSystemConfigFile() {
        System.out.println("Executing: readSystemConfigFile");
    }

    public void init() {
        System.out.println("Executing: init");
    }

    public void initializeContext() {
        System.out.println("Executing: initializeContext");
    }

    public void initializeListeners() {
        System.out.println("Executing: initializeListeners");
    }

    public void createSystemObjects() {
        System.out.println("Executing: createSystemObjects");
    }

    public void releaseProcesses() {
        System.out.println("Executing: releaseProcesses");
    }

    public void destroy() {
        System.out.println("Executing: destroy");
    }

    public void destroySystemObjects() {
        System.out.println("Executing: destroySystemObjects");
    }

    public void destroyListeners() {
        System.out.println("Executing: destroyListeners");
    }

    public void destroyContext() {
        System.out.println("Executing: destroyContext");
    }

    public void shutdown() {
        System.out.println("Executing: shutdown");
    }
}
