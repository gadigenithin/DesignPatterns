package com.designpatterns.behavioral.visitor;

public class AreaCalculator implements ShapeVisitor {

	private double totalArea;
	double radiusOfCircle = 5;
	double sideOfSquare = 4;
	double baseOfTriangle = 3;
	double heightOfTriangle = 6;

	@Override
	public void visit(Circle circle) {

		totalArea += Math.PI * Math.pow(radiusOfCircle, 2);

	}

	@Override
	public void visit(Square square) {

		totalArea += Math.pow(sideOfSquare, 2);

	}

	@Override
	public void visit(Triangle rentangle) {

		totalArea += (baseOfTriangle * heightOfTriangle) / 2;

	}

	public double getTotalArea() {
		return totalArea;
	}

}
