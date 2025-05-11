package com.designpatterns.structural.facade;

public class SmartSecuritySystem implements SecuritySystem {

	@Override
	public void lockDoors() {

		System.out.println("Doors are locked. ");

	}

	@Override
	public void activateSecurityCameras() {

		System.out.println("Security cameras are activated. ");

	}

}
