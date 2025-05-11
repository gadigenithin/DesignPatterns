package com.designpatterns.structural.bridge;

public class CreditCard implements PaymentMethod {

	private PaymentGateway paymentGateway;

	public CreditCard(PaymentGateway paymentGateway) {
		this.paymentGateway = paymentGateway;
	}

	@Override
	public void processPayment(double amount) {

		System.out.println("Processing Credit Card payment...");
		paymentGateway.processPayment("Credit Card", amount);

	}

}
