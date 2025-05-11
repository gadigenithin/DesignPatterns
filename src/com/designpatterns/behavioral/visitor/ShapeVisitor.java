package com.designpatterns.behavioral.visitor;

public interface ShapeVisitor {

	void visit(Circle circle);

	void visit(Square square);

	void visit(Triangle rentangle);

}

