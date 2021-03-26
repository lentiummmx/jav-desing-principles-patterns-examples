package com.globant.solid.open_closed;

import lombok.Data;

/**
 * Instead of add a flame pattern, stick to the open-closed principle and simply extend our Guitar class.
 *
 * By extending the Guitar class we can be sure that our existing application won't be affected
 */
@Data
public class SuperCoolGuitarWithFlames extends Guitar{

    private String flameColor;

    //constructor, getters + setters

}
