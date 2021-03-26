package com.globant.patterns.behavioral.interpreter.expression.impl;

import com.globant.patterns.behavioral.interpreter.expression.Expression;

public class Number implements Expression {

    private final int n;

    public Number(int n) {
        this.n = n;
    }

    @Override
    public int interpret() {
        return n;
    }
}
