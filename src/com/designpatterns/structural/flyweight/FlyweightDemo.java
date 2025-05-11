package com.designpatterns.structural.flyweight;

public class FlyweightDemo {

	public static void main(String[] args) {
		var sunFlower1 = FlowerFactory.createFlower("SunFlower");
		var sunFlower2 = FlowerFactory.createFlower("SunFlower");
		var sunFlower3 = FlowerFactory.createFlower("SunFlower");

		System.out.println(sunFlower1);
		System.out.println(sunFlower2);
		System.out.println(sunFlower3);

		System.out.println("\n----------------------------------------\n");

		var rose1 = FlowerFactory.createFlower("Rose");
		var rose2 = FlowerFactory.createFlower("Rose");
		var rose3 = FlowerFactory.createFlower("Rose");

		System.out.println(rose1);
		System.out.println(rose2);
		System.out.println(rose3);
	}

}
