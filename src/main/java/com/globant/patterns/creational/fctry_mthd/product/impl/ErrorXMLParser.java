package com.globant.patterns.creational.fctry_mthd.product.impl;

import com.globant.patterns.creational.fctry_mthd.product.XMLParser;

public class ErrorXMLParser implements XMLParser {
    @Override
    public String parse() {
        System.out.println("Parsing error XML...");
        return "Error XML Message";
    }
}
