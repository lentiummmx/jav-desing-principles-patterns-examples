package com.globant.patterns.creational.prototype.prototype;

import com.globant.patterns.creational.prototype.prototype.impl.AccessControl;

public interface Prototype extends Cloneable{
    public AccessControl clone() throws CloneNotSupportedException;
}
