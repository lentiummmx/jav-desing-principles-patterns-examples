package com.globant.thread_safety.volatile_flds;

import lombok.Getter;

/**
 * Let's consider the following example:
 */
public class User {

    @Getter
    private String name;

    @Getter
    private volatile int age;

    //standard constructors / getters
}
