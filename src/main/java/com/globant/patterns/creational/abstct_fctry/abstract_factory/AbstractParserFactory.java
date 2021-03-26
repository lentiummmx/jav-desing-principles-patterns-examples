package com.globant.patterns.creational.abstct_fctry.abstract_factory;

import com.globant.patterns.creational.abstct_fctry.product.XMLParser;

public interface AbstractParserFactory {
    public XMLParser getParserInstance(String parserType);
}
