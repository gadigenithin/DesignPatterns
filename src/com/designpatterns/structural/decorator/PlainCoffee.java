package com.designpatterns.structural.decorator;

public class PlainCoffee implements Coffee {

	@Override
	public String getDescription() {
		return "Plain Coffee";
	}

	@Override
	public double getCost() {
		return 5.0;
	}

}
