package com.globant.patterns.behavioral.strategy.strategy.impl;

import com.globant.patterns.behavioral.strategy.strategy.TextFormatter;

import java.util.Locale;

public class CapTextFormatter implements TextFormatter {
    @Override
    public void format(String text) {
        System.out.println("[CapTextFormatter]: " + text.toUpperCase(Locale.ROOT));
    }
}
