package com.globant.solid.single_responsibility;

import lombok.Data;

/**
 * A class should only have one responsibility. Furthermore, it should only have one reason to change.
 *
 * How does this principle help us to build better software?
 *
 * Testing – A class with one responsibility will have far fewer test cases
 * Lower coupling – Less functionality in a single class will have fewer dependencies
 * Organization – Smaller, well-organized classes are easier to search than monolithic ones
 */
@Data
public class Book {

    private String name;
    private String author;
    private String text;

    //constructor, getters and setters

    // methods that directly relate to the book properties
    public String replaceWordInText(String word) {
        return text.replaceAll(word, text);
    }

    public boolean isWordInText(String word) {
        return text.contains(word);
    }

    void printTextToConsole(){
        // our code for formatting and printing the text
        // ***** violate the single responsibility principle *****
    }
}
