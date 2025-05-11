package com.designpatterns.behavioral.command;

public class CommandDemo {

	public static void main(String[] args) {

		Stock stock = new Stock("Abc", 10);

		Broker broker = new Broker();

		broker.takeOrder(new PurchaseOrder(stock));
		broker.takeOrder(new SalesOrder(stock));

		broker.placeOrders();

	}

}