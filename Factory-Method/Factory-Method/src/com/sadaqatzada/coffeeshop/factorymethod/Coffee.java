package com.sadaqatzada.coffeeshop.factorymethod;

// Interface for coffee products
public interface Coffee {
    // Prepares the coffee
    void prepare();

    // Serves the coffee
    void serve();

    // Returns the coffee price
    double getPrice();

    // Returns the coffee name
    String getName();
}