package com.designpatterns.creational.factory;

public class Store {

	private static final FactoryDemo vendingMachine = new FactoryDemo();

	public static void main(String[] args) {

		buySnack("Chips");
		buySnack("Drink");
		buySnack("ChocolateBar");

	}

	private static void buySnack(String snackType) {
		Snack snack = vendingMachine.getSnack(snackType);

		System.out.println("One " + snackType + " purchased. The price is $" + snack.getPrice() + ".");

	}
}

