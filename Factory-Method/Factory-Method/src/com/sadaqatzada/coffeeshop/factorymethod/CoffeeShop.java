package com.sadaqatzada.coffeeshop.factorymethod;

// Abstract coffee shop class using Factory Method pattern
public abstract class CoffeeShop {
    // Factory method to create coffee (to be implemented by subclasses)
    public abstract Coffee createCoffee(String type);

    // Orders coffee using the factory method
    public void orderCoffee(String type) {
        Coffee coffee = createCoffee(type);
        coffee.prepare();
        coffee.serve();
        System.out.println("Your " + coffee.getName() + " is ready! Total: $" + coffee.getPrice());
    }
}