package com.globant.thread_safety.thread_local_flds;

import lombok.Getter;

public class StateHolder {
    @Getter
    private final String state;

    public StateHolder(String state) {
        this.state = state;
    }
}
