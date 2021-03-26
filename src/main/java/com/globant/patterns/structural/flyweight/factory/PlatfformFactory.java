package com.globant.patterns.structural.flyweight.factory;

import com.globant.patterns.structural.flyweight.flyweight.Platform;
import com.globant.patterns.structural.flyweight.flyweight.impl.CPPPlatform;
import com.globant.patterns.structural.flyweight.flyweight.impl.CPlatform;
import com.globant.patterns.structural.flyweight.flyweight.impl.JavaPlatform;
import com.globant.patterns.structural.flyweight.flyweight.impl.RubyPlatform;

import java.util.HashMap;
import java.util.Map;

public final class PlatfformFactory {

    private static Map<String, Platform> map = new HashMap<>();

    private PlatfformFactory() {
        throw new AssertionError("Cannot instiate the class");
    }

    public static synchronized  Platform getPlatformInstance(String platformType) {
        Platform platform = map.get(platformType);
        if (platform == null) {
            switch (platformType) {
                case "C": platform = new CPlatform();
                    break;
                case "CPP": platform = new CPPPlatform();
                    break;
                case "JAVA": platform = new JavaPlatform();
                    break;
                case "RUBY": platform = new RubyPlatform();
                    break;
            }
            map.put(platformType, platform);
        }
        return platform;
    }
}
