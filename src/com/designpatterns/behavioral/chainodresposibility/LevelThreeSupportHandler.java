package com.designpatterns.behavioral.chainodresposibility;

public class LevelThreeSupportHandler extends BaseSupportHandler {

	public LevelThreeSupportHandler(SupportHandler nextHandler) {
		super(nextHandler);
	}

	@Override
	public void handleRequest(Request request) {

		if (Priority.CRITICAL.equals(request.getPriority())) {
			System.out.println("Level three support handled the request. ");
		} else {
			System.out.println("Request cannot be handled.");
		}

	}

}
