package com.globant.patterns.structural.delegation.example_2.controller;

import com.globant.patterns.structural.delegation.example_2.printers.Printer;

public class PrinterController implements Printer {
    private final Printer printer;
    public PrinterController(Printer printer){
        this.printer = printer;
    }
    @Override
    public void print(String message) {
        this.printer.print(message);
    }
}
