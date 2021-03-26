package com.globant.patterns.behavioral.visitor.vistor.impl;

import com.globant.patterns.behavioral.visitor.support.HtmlElement;
import com.globant.patterns.behavioral.visitor.support.HtmlParentElement;
import com.globant.patterns.behavioral.visitor.vistor.Visitor;

public class CssClassVisitor implements Visitor {
    @Override
    public void visit(HtmlElement element) {
        element.setStartTag(element.getStartTag().replace(">", " class='visitor'>"));
    }

    @Override
    public void visit(HtmlParentElement element) {
        element.setStartTag(element.getStartTag().replace(">", " class='visitor'>"));
    }
}
