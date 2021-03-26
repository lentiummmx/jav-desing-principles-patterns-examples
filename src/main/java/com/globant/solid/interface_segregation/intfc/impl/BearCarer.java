package com.globant.solid.interface_segregation.intfc.impl;

import com.globant.solid.interface_segregation.intfc.v2.BearCleaner;
import com.globant.solid.interface_segregation.intfc.v2.BearFeeder;

public class BearCarer implements BearCleaner, BearFeeder {
    @Override
    public void washTheBear() {
        // I think we missed a spot...
    }

    @Override
    public void feedTheBear() {
        // Tuna Tuesdays...
    }
}
