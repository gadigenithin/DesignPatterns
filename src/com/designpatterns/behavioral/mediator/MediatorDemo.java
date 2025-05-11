package com.designpatterns.behavioral.mediator;

public class MediatorDemo {

	public static void main(String[] args) {

		AirTrafficMediator mediator = new AirportControlTower();

		Airplane airplane1 = new CommercialAirplane(mediator);
		Airplane airplane2 = new CommercialAirplane(mediator);

		airplane1.requestTakeOff();
		airplane2.requestLanding();

	}

}
