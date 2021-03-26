package com.globant.patterns.structural.adapter;

import com.globant.patterns.structural.adapter.payd.PayD;
import com.globant.patterns.structural.adapter.payd.XPayToPayDAdapter;
import com.globant.patterns.structural.adapter.xpay.XPay;
import com.globant.patterns.structural.adapter.xpay.XPayImpl;

public class RunAdapterExample {
    public static void main(String[] args) {
        // Object for XPay
        XPay xPay = new XPayImpl();
        xPay.setCreditCardNo("4789565874102365");
        xPay.setCustomerName("Max Warner");
        xPay.setCardExpMonth("09");
        xPay.setCardExpYear("25");
        xPay.setCardCVVNo((short)235);
        xPay.setAmount(2565.23);
        PayD payD = new XPayToPayDAdapter(xPay);
        testPayD(payD);
    }

    private static void testPayD(PayD payD){
        System.out.println(payD.getCardOwnerName());
        System.out.println(payD.getCustCardNo());
        System.out.println(payD.getCardExpMonthDate());
        System.out.println(payD.getCVVNo());
        System.out.println(payD.getTotalAmount());
    }
}
