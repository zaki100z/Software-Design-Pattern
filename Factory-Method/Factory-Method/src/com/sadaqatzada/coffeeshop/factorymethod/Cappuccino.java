package com.sadaqatzada.coffeeshop.factorymethod;

// Cappuccino coffee implementation
public class Cappuccino implements Coffee {
    // Prepares the cappuccino coffee
    @Override
    public void prepare() {
        System.out.println("Grinding beans and extracting Cappuccino shot");
    }

    // Serves the cappuccino coffee
    @Override
    public void serve() {
        System.out.println("Serving Cappuccino in a small cup");
    }

    // Returns the price of cappuccino
    @Override
    public double getPrice() {
        return 4.75;
    }

    // Returns the name of the coffee
    @Override
    public String getName() {
        return "Cappuccino";
    }
}