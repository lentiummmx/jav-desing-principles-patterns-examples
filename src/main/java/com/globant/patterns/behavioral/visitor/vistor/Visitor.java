package com.globant.patterns.behavioral.visitor.vistor;

import com.globant.patterns.behavioral.visitor.support.HtmlElement;
import com.globant.patterns.behavioral.visitor.support.HtmlParentElement;

public interface Visitor {
    public void visit(HtmlElement element);
    public void visit(HtmlParentElement element);
}
