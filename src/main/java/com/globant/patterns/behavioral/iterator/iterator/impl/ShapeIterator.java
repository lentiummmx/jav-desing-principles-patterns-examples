package com.globant.patterns.behavioral.iterator.iterator.impl;

import com.globant.patterns.behavioral.iterator.support.Shape;

import java.util.Iterator;

public class ShapeIterator implements Iterator<Shape> {

    private Shape[] shapes;
    int pos;

    public ShapeIterator(Shape[] shapes) {
        this.shapes = shapes;
    }

    @Override
    public void remove() {
        if (pos <= 0){
            throw new IllegalStateException("Illegal position");
        }
        if (shapes[pos - 1] != null) {
            for (int i = pos - 1; i < (shapes.length - 1); i++) {
                shapes[i] = shapes[i + 1];
            }
            shapes[shapes.length - 1] = null;
        }
    }

    @Override
    public boolean hasNext() {
        if (pos >= shapes.length || shapes[pos] == null)
            return false;
        return true;
    }

    @Override
    public Shape next() {
        return shapes[pos++];
    }
}
