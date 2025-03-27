package com.designpatterns.creational.prototype;

public class BuildingType {
    private String type;

	public BuildingType(String type) {
		this.setType(type);
	}

	public BuildingType(BuildingType buildingType) {
		this.setType(buildingType.getType());
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "BuildingType [type=" + type + "]";
	}

}
