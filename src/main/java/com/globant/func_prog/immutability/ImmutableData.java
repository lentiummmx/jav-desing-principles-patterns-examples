package com.globant.func_prog.immutability;

import lombok.Getter;

public class ImmutableData {
    @Getter
    private final String somData;
    @Getter
    private final AnotherImmutableData anotherImmutableData;

    public ImmutableData(final String somData, final AnotherImmutableData anotherImmutableData) {
        this.somData = somData;
        this.anotherImmutableData = anotherImmutableData;
    }
}
