package com.designpatterns.structural.bridge;

public class Client {

	public static void main(String[] args) {

		PaymentGateway bioPay = new BioPay();
		PaymentMethod creditCard = new CreditCard(bioPay);
		creditCard.processPayment(1500.0);

		System.out.println();

		PaymentGateway quantumPay = new QuantumPay();
		PaymentMethod bankTransfer = new BankTransfer(quantumPay);
		bankTransfer.processPayment(2000.0);

	}

}
