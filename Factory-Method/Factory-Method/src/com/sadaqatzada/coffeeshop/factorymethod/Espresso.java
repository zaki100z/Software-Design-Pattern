package com.sadaqatzada.coffeeshop.factorymethod;

// Concrete implementation of Coffee interface representing an Espresso
public class Espresso implements Coffee {

    // Prepares the espresso by grinding beans and extracting a shot
    @Override
    public void prepare() {
        System.out.println("Grinding beans and extracting espresso shot");
    }

    // Specifies how the espresso is served (in a small cup)
    @Override
    public void serve() {
        System.out.println("Serving espresso in a small cup");
    }

    // Returns the price of an espresso ($3.50)
    @Override
    public double getPrice() {
        return 3.50;
    }

    // Returns the product name identifier
    @Override
    public String getName() {
        return "Espresso";
    }
}