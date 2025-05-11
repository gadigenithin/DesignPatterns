package com.designpatterns.behavioral.template;

public class TeaMaker extends BeverageMaker {

	@Override
	public void brew() {

		System.out.println("Stepping the tea");

	}

	@Override
	public void addCondiments() {

		System.out.println("Adding lemon");

	}

}
