package com.designpatterns.creational.singleton;

public class Cat {

    private final Logger log = Logger.getInstance();

	public void meow() {

		System.out.println(log + "\n");

		log.log("In the CAT class. \n");
	}
}
