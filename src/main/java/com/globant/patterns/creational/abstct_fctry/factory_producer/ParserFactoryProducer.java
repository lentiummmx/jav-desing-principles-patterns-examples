package com.globant.patterns.creational.abstct_fctry.factory_producer;

import com.globant.patterns.creational.abstct_fctry.abstract_factory.AbstractParserFactory;
import com.globant.patterns.creational.abstct_fctry.abstract_factory.impl.NYParserFactory;
import com.globant.patterns.creational.abstct_fctry.abstract_factory.impl.TWParserFactory;

public class ParserFactoryProducer {
    private ParserFactoryProducer(){
        throw new AssertionError();
    }

    public static AbstractParserFactory getFactory(String factoryType) {
        switch (factoryType) {
            case "NYFactory": return new NYParserFactory();
            case "TWFactory": return new TWParserFactory();
        }
        return null;
    }
}
