package com.designpatterns.creational.abstractfactory;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class Application {

	private Button button;
	private Checkbox checkbox;

	private static final Map<String, Supplier<UIInterfaceFactory>> uiFactories = new HashMap<String, Supplier<UIInterfaceFactory>>();

	static {
		uiFactories.put("MAC", MacFactory::new);
		uiFactories.put("WINDOWS", WindowsFactory::new);
	}

	public void paint(String osName) {

		UIInterfaceFactory uiInterfaceFactory = getUIFactory(osName);

		button = uiInterfaceFactory.createButton();
		checkbox = uiInterfaceFactory.createCheckbox();

		button.paint();
		checkbox.paint();

	}

	private UIInterfaceFactory getUIFactory(String osName) {

		if (osName != null && uiFactories.get(osName.toUpperCase()) != null) {

			return uiFactories.get(osName.toUpperCase()).get();

		} else {

			throw new IllegalArgumentException("OS not Supported. ");

		}
	}

}

