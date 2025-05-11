package com.designpatterns.structural.facade;

public class SmartAudioSystem implements AudioSystem {

	@Override
	public void playMusic(String genre) {

		System.out.println("Playing " + genre + " music.");

	}

}
