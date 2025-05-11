package com.designpatterns.structural.decorator;

public class SugarDecorator extends BaseCoffeeDecorator {


	public SugarDecorator(Coffee decoratorCoffee) {
		super(decoratorCoffee);
	}

	@Override
	public String getDescription() {
		return super.getDescription() + ", Sugar";
	}

	@Override
	public double getCost() {
		return super.getCost() + 1.0;
	}

}