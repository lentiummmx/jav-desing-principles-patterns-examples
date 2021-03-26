package com.globant.patterns.creational.abstct_fctry.abstract_factory.impl;

import com.globant.patterns.creational.abstct_fctry.abstract_factory.AbstractParserFactory;
import com.globant.patterns.creational.abstct_fctry.product.XMLParser;
import com.globant.patterns.creational.abstct_fctry.product.impl.TWErrorXMLParser;
import com.globant.patterns.creational.abstct_fctry.product.impl.TWFeedbackXMLParser;
import com.globant.patterns.creational.abstct_fctry.product.impl.TWOrderXMLParser;
import com.globant.patterns.creational.abstct_fctry.product.impl.TWResponseXMLParser;

public class TWParserFactory implements AbstractParserFactory {
    @Override
    public XMLParser getParserInstance(String parserType) {
        switch (parserType) {
            case "TWERROR": return new TWErrorXMLParser();
            case "TWFEEDBACK": return new TWFeedbackXMLParser();
            case "TWORDER": return new TWOrderXMLParser();
            case "TWRESPONSE": return new TWResponseXMLParser();
        }
        return null;
    }
}
