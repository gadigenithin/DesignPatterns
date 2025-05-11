package com.designpatterns.behavioral.template;

public class CoffeeMaker extends BeverageMaker {

	@Override
	public void brew() {

		System.out.println("Dripping coffee through filter");

	}

	@Override
	public void addCondiments() {

		System.out.println("Adding sugar and milk");

	}

}
