package com.designpatterns.creational.factory;

public class ChocolateBar implements Snack {
	
	private double price = 20.0;

	@Override
	public double getPrice() {
		return price;
	}

}

