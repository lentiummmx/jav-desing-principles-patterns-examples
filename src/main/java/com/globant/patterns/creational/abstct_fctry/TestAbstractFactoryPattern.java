package com.globant.patterns.creational.abstct_fctry;

import com.globant.patterns.creational.abstct_fctry.abstract_factory.AbstractParserFactory;
import com.globant.patterns.creational.abstct_fctry.factory_producer.ParserFactoryProducer;
import com.globant.patterns.creational.abstct_fctry.product.XMLParser;

public class TestAbstractFactoryPattern {
    public static void main(String[] args) {
        AbstractParserFactory parserFactory = ParserFactoryProducer.getFactory("NYFactory");
        XMLParser parser = parserFactory.getParserInstance("NYORDER");
        String msg = null;
        msg = parser.parse();
        System.out.println(msg);

        System.out.println("************************************");

        parserFactory = ParserFactoryProducer.getFactory("TWFactory");
        parser = parserFactory.getParserInstance("TWFEEDBACK");
        msg = parser.parse();
        System.out.println(msg);
    }
}
