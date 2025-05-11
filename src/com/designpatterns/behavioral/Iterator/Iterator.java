package com.designpatterns.behavioral.Iterator;

public interface Iterator {

	public boolean hasNext();

	public Object getNext();

	public void reset();

}