package com.globant.patterns.creational.fctry_mthd.product.impl;

import com.globant.patterns.creational.fctry_mthd.product.XMLParser;

public class FeedbackXML implements XMLParser {
    @Override
    public String parse() {
        System.out.println("Parsing feedback XML ...");
        return "Feedback XML Message";
    }
}
