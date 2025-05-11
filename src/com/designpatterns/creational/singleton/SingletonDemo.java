package com.designpatterns.creational.singleton;

public class SingletonDemo {

	public static void main(String[] args) {
		Dog dog = new Dog();

		dog.woof();

		Cat cat = new Cat();

		cat.meow();
	}

}
