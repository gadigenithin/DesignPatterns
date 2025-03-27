package com.designpatterns.creational.singleton;

public class Dog {
	private final Logger log = Logger.getInstance();

	public void woof() {

		System.out.println(log + "\n");

		log.log("In the DOG class. \n");
	}
}
