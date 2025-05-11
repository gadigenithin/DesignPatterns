package com.designpatterns.behavioral.strategy;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

	private List<String> items = new ArrayList<String>();
	private double total;

	public void addItem(String itemName, double price) {
		items.add(itemName);
		total += price;
	}

	public void checkout(PaymentStrategy paymentMethod) {
		paymentMethod.pay(total);
	}

}
