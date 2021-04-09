package com.globant.func_prog.immutability;

import lombok.Getter;

public class AnotherImmutableData {
    @Getter
    private final Integer someOtherData;

    public AnotherImmutableData(final Integer someOtherData) {
        this.someOtherData = someOtherData;
    }
}
