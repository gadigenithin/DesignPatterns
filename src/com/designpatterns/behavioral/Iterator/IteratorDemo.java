package com.designpatterns.behavioral.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {
		BookCollection bookCollection = new BookCollection();

		bookCollection.addBook("Introduction to Algorithms");
		bookCollection.addBook("Algorithm Design Manual");
		bookCollection.addBook("Modern Operating Systems");
		bookCollection.addBook("Computer Networks");
		bookCollection.addBook("Database System Concepts");

		Iterator iterator = bookCollection.createIterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.getNext());
		}

	}

}