package com.globant.patterns.behavioral.visitor.element;

import com.globant.patterns.behavioral.visitor.vistor.Visitor;

public interface Element {
    public void accept(Visitor visitor);
}
