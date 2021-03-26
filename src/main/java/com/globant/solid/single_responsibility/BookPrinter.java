package com.globant.solid.single_responsibility;

/**
 * we have a separate class dedicated to this one concern
 */
public class BookPrinter {

    // methods for outputting text
    void printTextToConsole(String text) {
        // our code for formatting and printing the text
    }

    void printTextToAnotherMedia(String text) {
        // code for writing to any other location...
    }
}
