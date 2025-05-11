package com.designpatterns.structural.composite;

public class SimpleTask implements Task {

	private String title;

	public SimpleTask(String title) {
		super();
		this.title = title;
	}

	@Override
	public String getTitle() {
		return this.title;
	}

	@Override
	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public void display() {
		System.out.println("Simple Task: " + title);
	}

}
