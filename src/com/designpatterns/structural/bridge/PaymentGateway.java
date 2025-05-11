package com.designpatterns.structural.bridge;

public interface PaymentGateway {
    void processPayment(String paymentMethod, double amount);
}
