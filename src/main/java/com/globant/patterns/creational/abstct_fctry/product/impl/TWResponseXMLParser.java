package com.globant.patterns.creational.abstct_fctry.product.impl;

import com.globant.patterns.creational.abstct_fctry.product.XMLParser;

public class TWResponseXMLParser implements XMLParser {
    @Override
    public String parse() {
        System.out.println("TW Parsing response XML ...");
        return "TW Response XML Message";
    }
}
