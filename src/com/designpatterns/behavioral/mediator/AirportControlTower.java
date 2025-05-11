package com.designpatterns.behavioral.mediator;

public class AirportControlTower implements AirTrafficMediator {

	@Override
	public void requestTakeOff(Airplane airplane) {
		airplane.notifyAirTrafficControl("Requesting takeoff clearance. ");
	}

	@Override
	public void requestLanding(Airplane airplane) {
		airplane.notifyAirTrafficControl("Requesting landing clearance. ");
	}

}
