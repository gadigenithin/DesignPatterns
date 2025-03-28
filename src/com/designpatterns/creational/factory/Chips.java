package com.designpatterns.creational.factory;

public class Chips implements Snack {
    
    private double price = 10.0;

    @Override
    public double getPrice() {
        return price;
    }
}
