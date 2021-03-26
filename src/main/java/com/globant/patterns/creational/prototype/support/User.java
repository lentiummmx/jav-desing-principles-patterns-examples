package com.globant.patterns.creational.prototype.support;

import com.globant.patterns.creational.prototype.prototype.impl.AccessControl;
import lombok.Data;

@Data
public class User {

    private String userName;
    private String level;
    private AccessControl accessControl;

    public User(String userName, String level, AccessControl accessControl) {
        this.userName = userName;
        this.level = level;
        this.accessControl = accessControl;
    }
}
