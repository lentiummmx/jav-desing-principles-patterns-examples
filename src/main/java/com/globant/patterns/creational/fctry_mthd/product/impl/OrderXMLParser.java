package com.globant.patterns.creational.fctry_mthd.product.impl;

import com.globant.patterns.creational.fctry_mthd.product.XMLParser;

public class OrderXMLParser implements XMLParser {
    @Override
    public String parse() {
        System.out.println("Parsing order XML ...");
        return "Order XML Message";
    }
}
