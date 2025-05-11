package com.designpatterns.structural.facade;

public class SmartHomeFactory {

	public static AudioSystem createAudioSystem() {
		return new SmartAudioSystem();
	}

	public static LightingSystem createLightingSystem() {
		return new SmartLightingSystem();
	}

	public static SecuritySystem createSecuritySystem() {
		return new SmartSecuritySystem();
	}

}
