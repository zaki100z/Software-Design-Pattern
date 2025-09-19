package com.sadaqatzada.coffeeshop.factorymethod;

// Concrete implementation of Coffee interface representing Latte
// A Latte typically consists of espresso and steamed milk
public class Latte implements Coffee {

    // Prepares the latte by grinding beans and extracting the espresso base
    @Override
    public void prepare() {
        System.out.println("Grinding beans and extracting Latte shot");
    }

    // Specifies how the latte is served (typically in a larger cup than espresso)
    @Override
    public void serve() {
        System.out.println("Serving Latte in a small cup");
    }

    // Returns the price of a latte ($4.25)
    // Note: Price is higher than espresso due to additional ingredients
    @Override
    public double getPrice() {
        return 4.25;
    }

    // Returns the product name identifier
    @Override
    public String getName() {
        return "Latte";
    }
}