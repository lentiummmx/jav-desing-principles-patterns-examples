package com.globant.patterns.structural.flyweight;

import com.globant.patterns.structural.flyweight.factory.PlatfformFactory;
import com.globant.patterns.structural.flyweight.support.Code;
import com.globant.patterns.structural.flyweight.flyweight.Platform;

public class TestFlyweight {
    public static void main(String[] args) {
        Code code = new Code();
        code.setCode("C Code...");
        Platform platform = PlatfformFactory.getPlatformInstance("C");
        platform.execute(code);
        System.out.println("*************************");
        code = new Code();
        code.setCode("C Code2...");
        platform = PlatfformFactory.getPlatformInstance("C");
        platform.execute(code);
        System.out.println("*************************");
        code = new Code();
        code.setCode("JAVA Code...");
        platform = PlatfformFactory.getPlatformInstance("JAVA");
        platform.execute(code);
        System.out.println("*************************");
        code = new Code();
        code.setCode("JAVA Code2...");
        platform = PlatfformFactory.getPlatformInstance("JAVA");
        platform.execute(code);
        System.out.println("*************************");
        code = new Code();
        code.setCode("RUBY Code...");
        platform = PlatfformFactory.getPlatformInstance("RUBY");
        platform.execute(code);
        System.out.println("*************************");
        code = new Code();
        code.setCode("RUBY Code2...");
        platform = PlatfformFactory.getPlatformInstance("RUBY");
        platform.execute(code);
    }
}
