package com.globant.patterns.creational.fctry_mthd.creator.impl;

import com.globant.patterns.creational.fctry_mthd.creator.DisplayService;
import com.globant.patterns.creational.fctry_mthd.product.XMLParser;
import com.globant.patterns.creational.fctry_mthd.product.impl.OrderXMLParser;

public class OrderXMLDisplayService extends DisplayService {
    @Override
    protected XMLParser getParser() {
        return new OrderXMLParser();
    }
}
