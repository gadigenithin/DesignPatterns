package com.designpatterns.behavioral.state;

public class PaymentPendingState implements VendingMachineState {

	@Override
	public void handleRequest() {

		System.out.println("Payment pending state: Dispensing product. ");

	}

}