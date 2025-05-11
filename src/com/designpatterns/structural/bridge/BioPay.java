package com.designpatterns.structural.bridge;

public class BioPay implements PaymentGateway {

	@Override
	public void processPayment(String paymentMethod, double amount) {

		System.out.println("Processing " + paymentMethod + " payment of $" + amount + " through BioPay.");

	}

}