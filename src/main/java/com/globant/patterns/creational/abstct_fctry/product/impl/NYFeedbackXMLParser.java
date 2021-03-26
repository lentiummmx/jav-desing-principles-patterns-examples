package com.globant.patterns.creational.abstct_fctry.product.impl;

import com.globant.patterns.creational.abstct_fctry.product.XMLParser;

public class NYFeedbackXMLParser implements XMLParser {
    @Override
    public String parse() {
        System.out.println("NY Parsing feedback XML ...");
        return "NY Feedback XML Message";
    }
}
