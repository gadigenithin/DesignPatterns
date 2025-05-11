package com.designpatterns.behavioral.memento;


public class Document {

	private String text = "";

	public Document() {
	}

	public void write(String text) {
		this.text += text;
	}

	public String getText() {
		return text;
	}

	public DocumentMemento save() {
		return new DocumentMemento(text);
	}

	public void undo(DocumentMemento documentMemento) {
		text = documentMemento.getSavedState();
	}

}
