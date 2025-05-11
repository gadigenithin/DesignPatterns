package com.designpatterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject {

	private List<Observer> observers = new ArrayList<Observer>();
	private String weather;

	@Override
	public void addObserver(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}

	@Override
	public void notifyObservers() {

		observers.stream().forEach(observer -> observer.update(weather));

	}

	public void setWeather(String weather) {
		this.weather = weather;
		notifyObservers();
	}

}

