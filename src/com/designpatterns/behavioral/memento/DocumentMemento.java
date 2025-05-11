package com.designpatterns.behavioral.memento;

public class DocumentMemento {

	private String state;

	public DocumentMemento(String state) {
		this.state = state;
	}

	public String getSavedState() {
		return state;
	}

}