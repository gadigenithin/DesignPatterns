package com.designpatterns.behavioral.chainodresposibility;

public class LevelTwoSupportHandler extends BaseSupportHandler {

	public LevelTwoSupportHandler(SupportHandler nextHandler) {
		super(nextHandler);
	}

	@Override
	public void handleRequest(Request request) {

		if (Priority.INTERMEDIATE.equals(request.getPriority())) {
			System.out.println("Level two support handled the request.");
		} else if (nextHandler != null) {
			nextHandler.handleRequest(request);
		}

	}
}
