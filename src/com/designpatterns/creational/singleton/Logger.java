package com.designpatterns.creational.singleton;

public final class Logger {

	private Logger() {

	}

	private static Logger INSTANCE;

	public static Logger getInstance() {
		if (INSTANCE == null) {

			synchronized (Logger.class) {

				if (INSTANCE == null) {
					INSTANCE = new Logger();
				}

			}
		}

		return INSTANCE;
	}

	public void log(String loggerMessage) {
		System.out.println(loggerMessage);
	}

}
