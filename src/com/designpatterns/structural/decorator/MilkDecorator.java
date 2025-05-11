package com.designpatterns.structural.decorator;

public class MilkDecorator extends BaseCoffeeDecorator {

	public MilkDecorator(Coffee decoratorCoffee) {
		super(decoratorCoffee);
	}

	@Override
	public String getDescription() {
		return super.getDescription() + ", Milk";
	}

	@Override
	public double getCost() {
		return super.getCost() + 2.0;
	}

}
