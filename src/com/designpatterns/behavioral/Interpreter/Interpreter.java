package com.designpatterns.behavioral.Interpreter;

public class Interpreter {


	public Interpreter() {
	}

	public Integer interprete(String expressionText) {
		// logic to parse string and build expression.
		Expression expression = buildExpressionTree(expressionText);

		return expression.interpret();

	}

	private Expression buildExpressionTree(String expession) {

		return new AdditionExpression(new NumberExpression(2),
				new MultiplicationExpression(new NumberExpression(3), new NumberExpression(4)));
	}

}
