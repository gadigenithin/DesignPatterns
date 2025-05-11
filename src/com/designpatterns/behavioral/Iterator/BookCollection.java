package com.designpatterns.behavioral.Iterator;


import java.util.ArrayList;
import java.util.List;

public class BookCollection {

	private List<String> books;

	public BookCollection() {
		this.books = new ArrayList<String>();
	}

	public void addBook(String book) {
		books.add(book);
	}

	public String getBook(Integer index) {
		return books.get(index);
	}

	public int size() {
		return books.size();
	}

	public Iterator createIterator() {
		return new BookIterator(this);
	}

}
