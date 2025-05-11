package com.designpatterns.creational.factory;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class FactoryDemo {

	private static Map<String, Supplier<Snack>> snackMap = new HashMap<String, Supplier<Snack>>();

	static {
		snackMap.put("CHIPS", Chips::new);
		snackMap.put("DRINK", Drink::new);
		snackMap.put("CHOCOLATEBAR", ChocolateBar::new);
	}

	public Snack getSnack(String snackType) {
		
		if (snackType != null && snackMap.get(snackType.toUpperCase()) != null) {
			
			return snackMap.get(snackType.toUpperCase()).get();
			
		} else {
			
			throw new IllegalArgumentException("Snack not Supported");
		}

	}

}

