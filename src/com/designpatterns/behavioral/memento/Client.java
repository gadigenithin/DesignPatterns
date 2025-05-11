package com.designpatterns.behavioral.memento;


public class Client {
	
	public static void main(String[] args) {	
		
		Document document = new Document();
		DocumentHistory documentHistory = new DocumentHistory();
		
		
		document.write("Intial Text\n");
		documentHistory.save(document.save());
		
		document.write("Addtional Text\n");
		
		System.out.println("Currect text: \n" + document.getText());
		
		document.undo(documentHistory.undo());
		System.out.println("After undo: \n" + document.getText());

		document.undo(documentHistory.undo());
		System.out.println("After second undo: \n" + document.getText());
		
		
	}
	
    

}