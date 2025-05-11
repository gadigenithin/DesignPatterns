package com.designpatterns.behavioral.state;

public class OutOfStockState implements VendingMachineState {

	@Override
	public void handleRequest() {

		System.out.println("Out of stoct state: Product unavailable. Please select another product. ");

	}

}
