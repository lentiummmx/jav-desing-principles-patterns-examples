package com.globant.patterns.creational.abstct_fctry.product.impl;

import com.globant.patterns.creational.abstct_fctry.product.XMLParser;

public class TWOrderXMLParser implements XMLParser {
    @Override
    public String parse() {
        System.out.println("TW Parsing order XML ...");
        return "TW Order XML Message";
    }
}
