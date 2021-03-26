package com.globant.patterns.structural.delegation.example_2;

import com.globant.patterns.structural.delegation.example_2.controller.PrinterController;
import com.globant.patterns.structural.delegation.example_2.printers.impl.CanonPrinter;
import com.globant.patterns.structural.delegation.example_2.printers.impl.EpsonPrinter;
import com.globant.patterns.structural.delegation.example_2.printers.impl.HpPrinter;

/**
 * Hello world!
 *
 */
public class App 
{
    public static final String MESSAGE_TO_PRINT = "Hello World!";

    public static void main( String[] args )
    {
        System.out.println( "Hello World - 2!" );

        PrinterController hpPrinter = new PrinterController(new HpPrinter());
        PrinterController epsonPrinter = new PrinterController(new EpsonPrinter());
        PrinterController canonPrinter = new PrinterController(new CanonPrinter());

        hpPrinter.print(MESSAGE_TO_PRINT);
        epsonPrinter.print(MESSAGE_TO_PRINT);
        canonPrinter.print(MESSAGE_TO_PRINT);
    }
}
