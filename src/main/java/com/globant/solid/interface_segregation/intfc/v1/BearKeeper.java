package com.globant.solid.interface_segregation.intfc.v1;

/**
 * It simply means that larger interfaces should be split into smaller ones. By doing so,
 * we can ensure that implementing classes only need to be concerned about the methods
 * that are of interest to them.
 */
public interface BearKeeper {
    void washTheBear();
    void feedTheBear();
    void petTheBear();
}
