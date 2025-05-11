package com.designpatterns.structural.facade;

public class SmartLightingSystem implements LightingSystem {

	@Override
	public void turnOnLights() {

		System.out.println("Lights are ON. ");

	}

	@Override
	public void turnOffLights() {

		System.out.println("Lights are OFF. ");

	}

}
