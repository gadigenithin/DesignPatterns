package com.designpatterns.structural.flyweight;

public class Flower {

	private String name;

	public void setName(String name) {
		this.name = name;
	}

	public String getetName() {
		return name;
	}

	public Flower(String name) {
		this.name = name;

		System.out.println("Creating " + name + " object");

		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}

		System.out.println("Done creating " + name + " object");
	}

}
