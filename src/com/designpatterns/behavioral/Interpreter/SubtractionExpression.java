package com.designpatterns.behavioral.Interpreter;

public class SubtractionExpression implements Expression {

	private Expression left;
	private Expression right;

	public SubtractionExpression(Expression left, Expression right) {
		this.left = left;
		this.right = right;
	}

	@Override
	public Integer interpret() {
		return left.interpret() - right.interpret();
	}

}
