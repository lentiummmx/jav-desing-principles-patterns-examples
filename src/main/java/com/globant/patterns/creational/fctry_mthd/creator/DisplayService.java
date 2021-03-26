package com.globant.patterns.creational.fctry_mthd.creator;

import com.globant.patterns.creational.fctry_mthd.product.XMLParser;

public abstract class DisplayService {

    public void display() {
        XMLParser parser = getParser();
        String msg = parser.parse();
        System.out.println(msg);
    }

    protected abstract XMLParser getParser();
}
