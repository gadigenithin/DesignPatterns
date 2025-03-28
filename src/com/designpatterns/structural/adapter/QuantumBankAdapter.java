package com.designpatterns.structural.adapter;

public class QuantumBankAdapter implements SwiftPay {

    private QuantumBank quantumBank;

    public QuantumBankAdapter(QuantumBank quantumBank) {
        this.quantumBank = quantumBank;
    }

    @Override
    public void makePayment(String account, double amount) {

        quantumBank.processTracnsaction(account, amount);

    }

}
