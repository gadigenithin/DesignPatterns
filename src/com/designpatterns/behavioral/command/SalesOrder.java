package com.designpatterns.behavioral.command;

public class SalesOrder implements Order {

	private Stock stock;

	public SalesOrder(Stock stock) {
		super();
		this.stock = stock;
	}

	@Override
	public void execute() {
		stock.sell();

	}

}