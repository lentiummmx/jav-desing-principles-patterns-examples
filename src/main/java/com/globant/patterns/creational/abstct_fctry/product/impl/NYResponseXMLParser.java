package com.globant.patterns.creational.abstct_fctry.product.impl;

import com.globant.patterns.creational.abstct_fctry.product.XMLParser;

public class NYResponseXMLParser implements XMLParser {
    @Override
    public String parse() {
        System.out.println("NY Parsing response XML ...");
        return "NY Response XML Message";
    }
}
