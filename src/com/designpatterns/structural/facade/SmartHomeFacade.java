package com.designpatterns.structural.facade;

public class SmartHomeFacade implements SmartHomeApp {

	private AudioSystem audioSystem;
	private LightingSystem lightingSystem;
	private SecuritySystem securitySystem;

	public SmartHomeFacade(AudioSystem audioSystem, LightingSystem lightingSystem, SecuritySystem securitySystem) {
		this.audioSystem = audioSystem;
		this.lightingSystem = lightingSystem;
		this.securitySystem = securitySystem;
	}

	@Override
	public void prepareForBed() {

		System.out.println("\nPreparing home for bedtime...");

		lightingSystem.turnOffLights();
		securitySystem.lockDoors();
		securitySystem.activateSecurityCameras();
		audioSystem.playMusic("relaxing");

	}

	@Override
	public void wakeUpBed() {

		System.out.println("\nWaking up the home...");
		lightingSystem.turnOnLights();
		audioSystem.playMusic("energetic");

	}

}

