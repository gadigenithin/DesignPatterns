package com.designpatterns.structural.facade;

public class FacadeDemo {

	public static void main(String[] args) {

		SmartHomeApp smartHomeApp = buildSmartHomeApp();

		smartHomeApp.prepareForBed();

		smartHomeApp.wakeUpBed();

	}

	private static SmartHomeApp buildSmartHomeApp() {

		AudioSystem audioSystem = SmartHomeFactory.createAudioSystem();
		LightingSystem lightingSystem = SmartHomeFactory.createLightingSystem();
		SecuritySystem securitySystem = SmartHomeFactory.createSecuritySystem();

		return new SmartHomeFacade(audioSystem, lightingSystem, securitySystem);
	}

}