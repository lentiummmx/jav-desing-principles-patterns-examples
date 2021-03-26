package com.globant.patterns.creational.abstct_fctry.abstract_factory.impl;

import com.globant.patterns.creational.abstct_fctry.abstract_factory.AbstractParserFactory;
import com.globant.patterns.creational.abstct_fctry.product.XMLParser;
import com.globant.patterns.creational.abstct_fctry.product.impl.NYErrorXMLParser;
import com.globant.patterns.creational.abstct_fctry.product.impl.NYFeedbackXMLParser;
import com.globant.patterns.creational.abstct_fctry.product.impl.NYOrderXMLParser;
import com.globant.patterns.creational.abstct_fctry.product.impl.NYResponseXMLParser;

public class NYParserFactory implements AbstractParserFactory {
    @Override
    public XMLParser getParserInstance(String parserType) {
        switch (parserType) {
            case "NYERROR": return new NYErrorXMLParser();
            case "NYFEEDBACK": return new NYFeedbackXMLParser();
            case "NYORDER": return new NYOrderXMLParser();
            case "NYRESPONSE": return new NYResponseXMLParser();
        }
        return null;
    }
}
