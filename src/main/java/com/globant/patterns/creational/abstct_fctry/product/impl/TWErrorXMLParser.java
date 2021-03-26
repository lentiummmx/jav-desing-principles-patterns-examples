package com.globant.patterns.creational.abstct_fctry.product.impl;

import com.globant.patterns.creational.abstct_fctry.product.XMLParser;

public class TWErrorXMLParser implements XMLParser {
    @Override
    public String parse() {
        System.out.println("TW Parsing error XML ...");
        return "TW Error XML Message";
    }
}
