package com.designpatterns.creational.abstractfactory;

public class MacFactory implements UIInterfaceFactory {

	@Override
	public Button createButton() {
		return new MacButton();
	}

	@Override
	public Checkbox createCheckbox() {
		return new MacCheckbox();
	}

}
