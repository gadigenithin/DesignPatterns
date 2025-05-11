package com.designpatterns.behavioral.visitor;

public class Circle implements Shape {

	@Override
	public void accept(ShapeVisitor shapeVisitor) {

		shapeVisitor.visit(this);

	}

}
