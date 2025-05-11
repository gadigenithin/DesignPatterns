package com.designpatterns.behavioral.mediator;


public class CommercialAirplane implements Airplane {

	private AirTrafficMediator mediator;

	public CommercialAirplane(AirTrafficMediator mediator) {
		this.mediator = mediator;
	}

	@Override
	public void requestTakeOff() {
		mediator.requestTakeOff(this);
	}

	@Override
	public void requestLanding() {
		mediator.requestLanding(this);
	}

	@Override
	public void notifyAirTrafficControl(String message) {

		System.out.println("Commercial plane: " + message);

	}

}
