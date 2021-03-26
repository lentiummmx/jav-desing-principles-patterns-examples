package com.globant.patterns.creational.builder;

import com.globant.patterns.creational.builder.builder.CarBuilder;
import com.globant.patterns.creational.builder.builder.impl.SedanCarBuilder;
import com.globant.patterns.creational.builder.builder.impl.SportsCarBuilder;
import com.globant.patterns.creational.builder.director.CarDirector;
import com.globant.patterns.creational.builder.product.Car;
import com.globant.patterns.creational.builder.product.Form;

public class TestFormBuilder {
    public static void main(String[] args) {
        Form form = new Form.FormBuilder("Dave", "Carter", "DavCarter", "DAvCaEr123")
                .passwordHint("MyName")
                .city("NY")
                .language("English")
                .build();
        System.out.println(form);
    }
}
