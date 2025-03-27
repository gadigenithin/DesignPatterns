package com.designpatterns.creational.prototype;

public class Building extends Graphics {

	private BuildingType buildingType;

	public Building(int heightInPixels, BuildingType buildingType) {
		super(heightInPixels);
		this.buildingType = buildingType;
	}

	public BuildingType getBuildingType() {
		return buildingType;
	}

	public void setBuildingType(BuildingType buildingType) {
		this.buildingType = buildingType;
	}

	@Override
	public Building clone() {
		return new Building(getHeightInPixels(), new BuildingType(getBuildingType()));
	}

	@Override
	public String toString() {
		return "Building [buildingType=" + buildingType + ", HeightInPixels=" + getHeightInPixels() + "]";
	}

}
