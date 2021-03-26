package com.globant.patterns.behavioral.memento.memento;

import lombok.Data;

@Data
public class Memento {

    private double x;
    private double y;

    public Memento(double x, double y) {
        this.x = x;
        this.y = y;
    }
}
