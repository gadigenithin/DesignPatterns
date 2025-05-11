package com.designpatterns.behavioral.Interpreter;

public class Client {

	public static void main(String[] args) {
		Interpreter interpreter = new Interpreter();

		Integer result = interpreter.interprete("2 + 3 * 4");

		System.out.println("Result : " + result);

	}

}
