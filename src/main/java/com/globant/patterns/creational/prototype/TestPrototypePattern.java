package com.globant.patterns.creational.prototype;

import com.globant.patterns.creational.prototype.prototype.impl.AccessControl;
import com.globant.patterns.creational.prototype.support.AccessControlProvider;
import com.globant.patterns.creational.prototype.support.User;

public class TestPrototypePattern {
    public static void main(String[] args) {
        AccessControl userAccessControl = AccessControlProvider.getAccessControlObject("USER");
        User userA = new User("User A", "USER Level", userAccessControl);
        System.out.println(userA);
        System.out.println("************************************");

        userAccessControl = AccessControlProvider.getAccessControlObject("USER");
        User userB = new User("User B", "USER Level", userAccessControl);
        System.out.println("Changing access control of: "+userB.getUserName());
        userB.getAccessControl().setAccess("READ REPORTS");
        System.out.println(userB);
        System.out.println("************************************");
        System.out.println(userA);
        System.out.println("************************************");

        AccessControl managerAccessControl = AccessControlProvider.getAccessControlObject("MANAGER");
        User userC = new User("User C", "MANAGER Level", managerAccessControl);
        System.out.println(userC);
    }
}
