package com.designpatterns.structural.adapter;

public class Client {

    public static void main(String[] args) {

        StarBank starBank = new StarBank();
        QuantumBank quantumBank = new QuantumBank();

        SwiftPay starBankAdapter = new StarBankAdapter(starBank);
        SwiftPay quantumBankAdapter = new QuantumBankAdapter(quantumBank);

        System.out.println("Using StarBank:");
        starBankAdapter.makePayment("ABC123EFG456", 1200.0);

        System.out.println("\nUsing QuantumBank:");
        quantumBankAdapter.makePayment("789XYZ012", 1500.0);

    }

}
