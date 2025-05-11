package com.designpatterns.behavioral.state;


public class VendingMachineContext {

	private VendingMachineState vendingMachineState;

	public void setState(VendingMachineState vendingMachineState) {
		this.vendingMachineState = vendingMachineState;
	}

	void request() {

		vendingMachineState.handleRequest();

	}

}
