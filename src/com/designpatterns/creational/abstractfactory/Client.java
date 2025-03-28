package com.designpatterns.creational.abstractfactory;

public class Client {

    public static void main(String[] args) {
        Application app = new Application();

        System.out.println("Mac OS:");
        app.paint("Mac");

        System.out.println("\nWindows OS:");
        app.paint("Windows");

    }

}
