package com.example.rmi;

import java.math.BigInteger;
import java.rmi.Remote;

// Creating an Interface
public interface Factorial extends Remote {
    // Declaring the method
    public BigInteger fact(int num) throws java.rmi.RemoteException;
}
