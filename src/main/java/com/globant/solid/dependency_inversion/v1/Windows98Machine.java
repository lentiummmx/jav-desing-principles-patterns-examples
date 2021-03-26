package com.globant.solid.dependency_inversion.v1;

/**
 * The principle of Dependency Inversion refers to the decoupling of software modules.
 * This way, instead of high-level modules depending on low-level modules, both will depend on
 * abstractions.
 *
 * By declaring the StandardKeyboard and Monitor with the new keyword, we've tightly coupled
 * these 3 classes together.
 */
public class Windows98Machine {

    private final StandardKeyboard keyboard;
    private final Monitor monitor;

    public Windows98Machine() {
        this.keyboard = new StandardKeyboard();
        this.monitor = new Monitor();
    }
}
