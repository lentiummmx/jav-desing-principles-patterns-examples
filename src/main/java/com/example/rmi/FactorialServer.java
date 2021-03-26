package com.example.rmi;

import java.rmi.Naming;

public class FactorialServer {

    // Implement the constructor of the class
    public FactorialServer()
    {
        try {
            // Create a object reference for the interface
            Factorial c = new FactorialImpl();

            // Bind the localhost with the service
            Naming.rebind("rmi://localhost/FactorialService", c);
        }
        catch (Exception e) {
            // If any error occur
            System.out.println("ERR: " + e);
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        // Create an object
        new FactorialServer();
    }
}
