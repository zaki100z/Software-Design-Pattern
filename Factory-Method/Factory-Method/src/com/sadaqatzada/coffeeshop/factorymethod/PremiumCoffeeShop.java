package com.sadaqatzada.coffeeshop.factorymethod;


// This class follows the Factory Method pattern by implementing the creation logic
public class PremiumCoffeeShop extends CoffeeShop {

    // This method is the core of the Factory Method pattern implementation
    @Override
    public Coffee createCoffee(String type) {

        // Converts input to lowercase for case-insensitive matching
        return switch (type.toLowerCase()) {
            // Creates a new Espresso instance for "espresso" type
            case "espresso" -> new Espresso();

            // Creates a new Cappuccino instance for "cappuccino" type
            case "cappuccino" -> new Cappuccino();

            // Creates a new Latte instance for "latte" type
            case "latte" -> new Latte();

            // Handles unknown coffee types with a clear error message
            default -> throw new IllegalArgumentException("Unknown coffee type: " + type);
        };
    }
}