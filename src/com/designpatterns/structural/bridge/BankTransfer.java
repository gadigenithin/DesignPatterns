package com.designpatterns.structural.bridge;

public class BankTransfer implements PaymentMethod {

	private PaymentGateway paymentGateway;

	public BankTransfer(PaymentGateway paymentGateway) {
		this.paymentGateway = paymentGateway;
	}

	@Override
	public void processPayment(double amount) {

		System.out.println("Processing Bank Transfer payment...");
		paymentGateway.processPayment("Bank Transfer", amount);

	}

}
