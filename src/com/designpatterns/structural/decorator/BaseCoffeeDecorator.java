package com.designpatterns.structural.decorator;

public abstract class BaseCoffeeDecorator implements Coffee {

	private Coffee decoratedCoffee;

	public BaseCoffeeDecorator(Coffee coffee) {

		this.decoratedCoffee = coffee;

	}

	@Override
	public String getDescription() {
		return decoratedCoffee.getDescription();
	}

	@Override
	public double getCost() {
		return decoratedCoffee.getCost();
	}

}
