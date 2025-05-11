package com.designpatterns.behavioral.chainodresposibility;

public class Main {

	public static void main(String[] args) {

		SupportHandler supportHandler = buildSupportHandler();

		Request request1 = new Request(Priority.BASIC);
		Request request2 = new Request(Priority.INTERMEDIATE);
		Request request3 = new Request(Priority.CRITICAL);

		supportHandler.handleRequest(request1);
		supportHandler.handleRequest(request2);
		supportHandler.handleRequest(request3);

	}

	private static SupportHandler buildSupportHandler() {
		SupportHandler levelThreeSupportHandler = new LevelThreeSupportHandler(null);
		SupportHandler levelTwoSupportHandler = new LevelTwoSupportHandler(levelThreeSupportHandler);
		SupportHandler levelOneSupportHandler = new LevelOneSupportHandler(levelTwoSupportHandler);

		return levelOneSupportHandler;
	}

}
