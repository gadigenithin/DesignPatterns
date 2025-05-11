package com.designpatterns.behavioral.Interpreter;

public class MultiplicationExpression implements Expression {

	private Expression left;
	private Expression right;

	public MultiplicationExpression(Expression left, Expression right) {
		super();
		this.left = left;
		this.right = right;
	}

	@Override
	public Integer interpret() {
		return left.interpret() * right.interpret();
	}

}

