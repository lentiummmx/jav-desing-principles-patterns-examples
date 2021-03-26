package com.globant.patterns.creational.prototype.prototype.impl;

import com.globant.patterns.creational.prototype.prototype.Prototype;
import lombok.Data;

@Data
public class AccessControl implements Prototype {

    private final String controlLevel;
    private String access;

    public AccessControl(String controlLevel, String access) {
        this.controlLevel = controlLevel;
        this.access = access;
    }

    @Override
    public AccessControl clone() {
        try {
            return (AccessControl) super.clone();
        } catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return null;
    }
}
