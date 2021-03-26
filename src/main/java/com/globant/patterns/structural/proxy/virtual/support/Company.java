package com.globant.patterns.structural.proxy.virtual.support;

import com.globant.patterns.structural.proxy.virtual.proxy.ContactList;
import lombok.Data;

@Data
public class Company {

    private String companyName;
    private String companyAddress;
    private String companyContactNo;
    private ContactList contactList;

    public Company(String companyName, String companyAddress, String companyContactNo, ContactList contactList) {
        this.companyName = companyName;
        this.companyAddress = companyAddress;
        this.companyContactNo = companyContactNo;
        this.contactList = contactList;
        System.out.println("Company object created...");
    }
}
