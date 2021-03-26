package com.globant.patterns.behavioral.iterator.support;

import lombok.Data;

@Data
public class Shape {

    private int id;
    private String name;

    public Shape(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
