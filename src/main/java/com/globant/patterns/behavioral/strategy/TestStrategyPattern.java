package com.globant.patterns.behavioral.strategy;

import com.globant.patterns.behavioral.strategy.context.TextEditor;
import com.globant.patterns.behavioral.strategy.strategy.TextFormatter;
import com.globant.patterns.behavioral.strategy.strategy.impl.CapTextFormatter;
import com.globant.patterns.behavioral.strategy.strategy.impl.LowerTextFormatter;

public class TestStrategyPattern {
    public static void main(String[] args) {
        TextFormatter formatter = new CapTextFormatter();
        TextEditor editor = new TextEditor(formatter);
        editor.publishText("Testing text in caps formatter");

        formatter = new LowerTextFormatter();
        editor = new TextEditor(formatter);
        editor.publishText("Testing text in lower formatter");
    }
}
