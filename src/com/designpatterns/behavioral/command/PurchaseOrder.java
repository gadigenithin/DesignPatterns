package com.designpatterns.behavioral.command;

public class PurchaseOrder implements Order {

	private Stock stock;

	public PurchaseOrder(Stock stock) {
		super();
		this.stock = stock;
	}

	@Override
	public void execute() {

		stock.buy();

	}

}