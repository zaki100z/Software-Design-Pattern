package com.sadaqatzada.coffeeshop.abstractfactory;

// Dark-themed button implementation
public class DarkButton implements Button {

    // Renders dark-themed button UI element
    @Override
    public void render() {
        System.out.println("Rendering dark-themed button");
    }

    // Handles click event for dark-themed button
    @Override
    public void onClick() {
        System.out.println("Dark button clicked");
    }
}