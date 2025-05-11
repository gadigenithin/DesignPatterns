package com.designpatterns.behavioral.visitor;

public interface Shape {

	void accept(ShapeVisitor shapeVisitor);

}
