package com.globant.patterns.creational.fctry_mthd.product.impl;

import com.globant.patterns.creational.fctry_mthd.product.XMLParser;

public class ResponseXMLParser implements XMLParser {
    @Override
    public String parse() {
        System.out.println("Parsing response XML ...");
        return "Response XML Message";
    }
}
