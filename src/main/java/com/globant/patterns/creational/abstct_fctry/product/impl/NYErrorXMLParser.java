package com.globant.patterns.creational.abstct_fctry.product.impl;

import com.globant.patterns.creational.abstct_fctry.product.XMLParser;

public class NYErrorXMLParser implements XMLParser {
    @Override
    public String parse() {
        System.out.println("NY Parsing error XML ...");
        return "NY Error XML Message";
    }
}
