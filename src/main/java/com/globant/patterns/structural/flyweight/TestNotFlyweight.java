package com.globant.patterns.structural.flyweight;

import com.globant.patterns.structural.flyweight.flyweight.impl.JavaPlatform;
import com.globant.patterns.structural.flyweight.support.Code;
import com.globant.patterns.structural.flyweight.flyweight.Platform;

public class TestNotFlyweight {
    public static void main(String[] args) {
        Platform platform = new JavaPlatform();
        platform.execute(new Code());
    }
}
