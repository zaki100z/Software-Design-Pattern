package com.sadaqatzada.coffeeshop.abstractfactory;

// Light-themed button implementation
public class LightButton implements Button {

    // Renders light-themed button UI element
    @Override
    public void render() {
        System.out.println("Rendering light-themed button");
    }

    // Handles click event for light-themed button
    @Override
    public void onClick() {
        System.out.println("Light button clicked");
    }
}