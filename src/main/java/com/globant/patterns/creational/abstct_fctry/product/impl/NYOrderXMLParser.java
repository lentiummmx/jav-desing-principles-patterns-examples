package com.globant.patterns.creational.abstct_fctry.product.impl;

import com.globant.patterns.creational.abstct_fctry.product.XMLParser;

public class NYOrderXMLParser implements XMLParser {
    @Override
    public String parse() {
        System.out.println("NY Parsing order XML ...");
        return "NY Order XML Message";
    }
}
