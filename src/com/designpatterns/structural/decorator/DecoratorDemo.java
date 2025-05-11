package com.designpatterns.structural.decorator;

public class DecoratorDemo {

	public static void main(String[] args) {

		Coffee plainCoffee = new PlainCoffee();
		System.out.println("Description: " + plainCoffee.getDescription());
		System.out.println("Cost: " + plainCoffee.getCost());

		Coffee milkCoffee = new MilkDecorator(new PlainCoffee());
		System.out.println("\nDescription: " + milkCoffee.getDescription());
		System.out.println("Cost: " + milkCoffee.getCost());

		Coffee milkSugarCoffee = new SugarDecorator(new MilkDecorator(new PlainCoffee()));
		System.out.println("\nDescription: " + milkSugarCoffee.getDescription());
		System.out.println("Cost: " + milkSugarCoffee.getCost());

	}

}