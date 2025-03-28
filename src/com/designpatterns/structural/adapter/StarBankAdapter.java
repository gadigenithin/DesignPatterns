package com.designpatterns.structural.adapter;

public class StarBankAdapter implements SwiftPay {

    private StarBank starBank;

    public StarBankAdapter(StarBank starBank) {
        this.starBank = starBank;
    }

    @Override
    public void makePayment(String account, double amount) {
        starBank.initiatePayment(account, amount);
    }

}
