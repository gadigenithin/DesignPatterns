package com.designpatterns.behavioral.Interpreter;

public class AdditionExpression implements Expression {

	private Expression left;
	private Expression right;

	public AdditionExpression(Expression left, Expression right) {
		this.left = left;
		this.right = right;
	}

	@Override
	public Integer interpret() {
		return left.interpret() + right.interpret();
	}

}
