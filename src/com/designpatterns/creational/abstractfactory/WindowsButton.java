package com.designpatterns.creational.abstractfactory;

public class WindowsButton implements Button {

	@Override
	public void paint() {

		System.out.println("You have created WindowsButton. ");

	}

}
