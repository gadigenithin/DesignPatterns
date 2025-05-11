package com.designpatterns.behavioral.strategy;

public class CashOnDelivery implements PaymentStrategy {

	@Override
	public void pay(double amount) {

		System.out.println("Cash of ₹" + amount + " to be collected on delivery.");

	}

}