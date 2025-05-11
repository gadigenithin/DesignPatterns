package com.designpatterns.behavioral.Iterator;


public class BookIterator implements Iterator {

	private BookCollection bookCollection;
	private Integer currentIndex;

	public BookIterator(BookCollection bookCollection) {
		this.bookCollection = bookCollection;
		currentIndex = 0;
	}

	@Override
	public boolean hasNext() {
		return currentIndex < bookCollection.size();
	}

	@Override
	public Object getNext() {

		if (hasNext()) {
			return bookCollection.getBook(currentIndex++);
		}

		return null;
	}

	@Override
	public void reset() {

		currentIndex = 0;

	}

}
