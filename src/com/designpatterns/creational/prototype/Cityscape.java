package com.designpatterns.creational.prototype;

import java.util.List;

public class Cityscape {

    
	public static void main(String[] args) {

		BuildingType houseBuildingType = new BuildingType("House");
		Building building1 = new Building(20, houseBuildingType);
		Building building2 = building1.clone();
		Building building3 = building1.clone();
		Building building4 = building1.clone();
		Building building5 = building1.clone();

		houseBuildingType.setType("House with yards");

		BuildingType skyscraperBuildingType = new BuildingType("Skyscrapper");
		Building skyscrapper1 = new Building(20, skyscraperBuildingType);
		Building skyscrapper2 = skyscrapper1.clone();
		Building skyscrapper3 = skyscrapper1.clone();
		Building skyscrapper4 = skyscrapper1.clone();
		Building skyscrapper5 = skyscrapper1.clone();

		List<Graphics> graphics = List.of(building1, building2, building3, building4, building5, skyscrapper1,
				skyscrapper2, skyscrapper3, skyscrapper4, skyscrapper5);

		createCityOrder(graphics);

	}

	private static void createCityOrder(List<Graphics> order) {
		System.out.println("Order created for Graphics: ");

		order.stream().forEach(System.out::println);

	}

}
