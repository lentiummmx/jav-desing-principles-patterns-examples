package com.globant.patterns.creational.fctry_mthd;

import com.globant.patterns.creational.fctry_mthd.creator.DisplayService;
import com.globant.patterns.creational.fctry_mthd.creator.impl.ErrorXMLDisplayService;
import com.globant.patterns.creational.fctry_mthd.creator.impl.FeedbackXMLDisplayService;
import com.globant.patterns.creational.fctry_mthd.creator.impl.OrderXMLDisplayService;
import com.globant.patterns.creational.fctry_mthd.creator.impl.ResponseXMLDisplayService;

public class TestFactoryMethodPattern {
    public static void main(String[] args) {
        DisplayService service = new FeedbackXMLDisplayService();
        service.display();

        service = new ErrorXMLDisplayService();
        service.display();

        service = new OrderXMLDisplayService();
        service.display();

        service = new ResponseXMLDisplayService();
        service.display();
    }
}
