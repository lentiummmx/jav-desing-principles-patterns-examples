package com.globant.patterns.behavioral.strategy.context;

import com.globant.patterns.behavioral.strategy.strategy.TextFormatter;

public class TextEditor {

    private final TextFormatter textFormatter;

    public TextEditor(TextFormatter textFormatter) {
        this.textFormatter = textFormatter;
    }

    public void publishText(String text) {
        textFormatter.format(text);
    }
}
