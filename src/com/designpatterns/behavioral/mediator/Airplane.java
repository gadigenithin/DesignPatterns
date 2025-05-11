package com.designpatterns.behavioral.mediator;

public interface Airplane {

	public void requestTakeOff();

	public void requestLanding();

	public void notifyAirTrafficControl(String message);

}
