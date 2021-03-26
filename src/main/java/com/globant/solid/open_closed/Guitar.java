package com.globant.solid.open_closed;

import lombok.Data;

/**
 * Formally known as the open-closed principle. Simply put, classes should be open for extension,
 * but closed for modification. In doing so, we stop ourselves from modifying existing code and
 * causing potential new bugs.
 *
 * The one exception to the rule is when fixing bugs in existing code.
 */
@Data
public class Guitar {

    private String make;
    private String model;
    private int volume;

    // Constructors, getters & setters

}
