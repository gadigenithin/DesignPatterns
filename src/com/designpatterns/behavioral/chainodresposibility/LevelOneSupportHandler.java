package com.designpatterns.behavioral.chainodresposibility;

public class LevelOneSupportHandler extends BaseSupportHandler {

	public LevelOneSupportHandler(SupportHandler nextHandler) {
		super(nextHandler);
	}

	@Override
	public void handleRequest(Request request) {
		if (Priority.BASIC.equals(request.getPriority())) {
			System.out.println("Level one support handled the request. ");
		} else if (nextHandler != null) {
			nextHandler.handleRequest(request);
		}
	}

}
