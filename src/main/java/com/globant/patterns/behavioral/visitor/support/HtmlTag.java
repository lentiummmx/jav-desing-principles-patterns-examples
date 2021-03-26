package com.globant.patterns.behavioral.visitor.support;

import com.globant.patterns.behavioral.visitor.element.Element;

import java.util.List;

/**
 * Component
 */
public abstract class HtmlTag implements Element {
    public abstract String getTagName();
    public abstract void setStartTag(String tag);
    public abstract String getStartTag();
    public abstract void setEndTag(String tag);
    public abstract String getEndTag();
    public void setTagBody(String tagBody) {
        throw new UnsupportedOperationException("Current operation is not support for this object");
    }
    public void addChildTag(HtmlTag htmlTag){
        throw new UnsupportedOperationException("Current operation is not support for this object");
    }
    public void removeChildTag(HtmlTag htmlTag){
        throw new UnsupportedOperationException("Current operation is not support for this object");
    }
    public List<HtmlTag> getChildren(){
        throw new UnsupportedOperationException("Current operation is not support for this object");
    }
    public abstract void generateHtml();
}
