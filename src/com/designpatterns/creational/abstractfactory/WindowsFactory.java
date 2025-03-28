package com.designpatterns.creational.abstractfactory;

public class WindowsFactory implements UIInterfaceFactory {

	@Override
	public Button createButton() {
		return new WindowsButton();
	}

	@Override
	public Checkbox createCheckbox() {
		return new WindowsCheckbox();
	}

}