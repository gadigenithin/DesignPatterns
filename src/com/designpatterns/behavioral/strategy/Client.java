package com.designpatterns.behavioral.strategy;

public class Client {

	public static void main(String[] args) {

		ShoppingCart cart = new ShoppingCart();

		cart.addItem("Mobile Phone", 15000);
		cart.addItem("Charge", 500);

		cart.checkout(new CashOnDelivery());
		cart.checkout(new CreditCardPayment("1234567812345678"));
		cart.checkout(new UpiPayment("user@upi"));

	}

}
