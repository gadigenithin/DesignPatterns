package com.designpatterns.behavioral.visitor;

public class Triangle implements Shape {

	@Override
	public void accept(ShapeVisitor shapeVisitor) {

		shapeVisitor.visit(this);

	}

}
