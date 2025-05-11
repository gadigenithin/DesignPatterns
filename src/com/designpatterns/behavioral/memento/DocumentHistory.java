package com.designpatterns.behavioral.memento;

import java.util.Stack;

public class DocumentHistory {

	Stack<DocumentMemento> history = new Stack<DocumentMemento>();

	public void save(DocumentMemento documentMemento) {
		history.push(documentMemento);
	}

	public DocumentMemento undo() {
		if (!history.isEmpty()) {
			return history.pop();
		}

		return new DocumentMemento("");
	}

}