package com.designpatterns.behavioral.chainodresposibility;

public abstract class BaseSupportHandler implements SupportHandler {

	protected SupportHandler nextHandler;

	public BaseSupportHandler(SupportHandler nextHandler) {
		this.nextHandler = nextHandler;
	}

}