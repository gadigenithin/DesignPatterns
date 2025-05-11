package com.designpatterns.behavioral.template;

public class TemplateDemo {

	public static void main(String[] args) {

		System.out.println("Making Tea: ");
		BeverageMaker teaMaker = new TeaMaker();
		teaMaker.makeBeverage();

		System.out.println("\n----------------------------------\n");

		System.out.println("Making Coffee: ");
		BeverageMaker coffeeMaker = new CoffeeMaker();
		coffeeMaker.makeBeverage();

	}

}