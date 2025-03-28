package com.designpatterns.structural.adapter;

public class QuantumBank {

	public void processTracnsaction(String account, double amount) {
		
		System.out.println("QuantumBank: Processing transaction for account " + account + " with amount $" + amount);

	}

}
