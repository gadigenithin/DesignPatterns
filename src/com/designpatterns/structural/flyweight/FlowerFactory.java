package com.designpatterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class FlowerFactory {

	public static Map<String, Flower> flowerCache = new HashMap<>();

	public static Flower createFlower(String flowerName) {

		return flowerCache.computeIfAbsent(flowerName, Flower::new);

	}

}
