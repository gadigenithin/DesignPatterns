package com.designpatterns.creational.factory;

public class Drink implements Snack {

	private double price = 30.0;

	@Override
	public double getPrice() {
		return price;
	}

}