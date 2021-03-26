package com.globant.patterns.creational.fctry_mthd.creator.impl;

import com.globant.patterns.creational.fctry_mthd.creator.DisplayService;
import com.globant.patterns.creational.fctry_mthd.product.XMLParser;
import com.globant.patterns.creational.fctry_mthd.product.impl.OrderXMLParser;
import com.globant.patterns.creational.fctry_mthd.product.impl.ResponseXMLParser;

public class ResponseXMLDisplayService extends DisplayService {
    @Override
    protected XMLParser getParser() {
        return new ResponseXMLParser();
    }
}
