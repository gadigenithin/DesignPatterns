package com.designpatterns.behavioral.Interpreter;

public class NumberExpression implements Expression {

	private Integer number;

	public NumberExpression(Integer number) {
		this.number = number;
	}

	@Override
	public Integer interpret() {
		return this.number;
	}

}
