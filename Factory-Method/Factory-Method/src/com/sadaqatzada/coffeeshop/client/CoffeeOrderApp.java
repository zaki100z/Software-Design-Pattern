package com.sadaqatzada.coffeeshop.client;

import com.sadaqatzada.coffeeshop.factorymethod.CoffeeShop;
import com.sadaqatzada.coffeeshop.factorymethod.PremiumCoffeeShop;
import com.sadaqatzada.coffeeshop.abstractfactory.GUIThemeFactory;
import com.sadaqatzada.coffeeshop.abstractfactory.Panel;
import com.sadaqatzada.coffeeshop.abstractfactory.Button;
import com.sadaqatzada.coffeeshop.abstractfactory.TextField;
import com.sadaqatzada.coffeeshop.abstractfactory.DarkThemeFactory;

public class CoffeeOrderApp {
    private CoffeeShop coffeeShop;
    private GUIThemeFactory guiFactory;

    // Store the selected coffee type
    private String selectedCoffeeType;

    public CoffeeOrderApp(CoffeeShop coffeeShop, GUIThemeFactory guiFactory) {
        this.coffeeShop = coffeeShop;
        this.guiFactory = guiFactory;
        // Default value
        this.selectedCoffeeType = "Cappuccino";
    }

    public void displayOrderInterface() {
        System.out.println("=== Coffee Order Interface ===");

        Panel mainPanel = guiFactory.createPanel();
        Button orderButton = guiFactory.createButton();
        TextField coffeeTypeField = guiFactory.createTextField();

        mainPanel.render();
        coffeeTypeField.setText(selectedCoffeeType);
        coffeeTypeField.render();
        orderButton.render();

        // Simulate button click - this would update the coffee type in a real UI
        orderButton.onClick();

        // Use the store coffee type instead of trying to get it from the text field
        coffeeShop.orderCoffee(selectedCoffeeType);
    }

    // Method to simulate changing coffee type
    public void setCoffeeType(String coffeeType) {

        this.selectedCoffeeType = coffeeType;
    }

    public static void main(String[] args) {
        System.out.println("=== Coffee Shop Order System ===");

        CoffeeShop shop = new PremiumCoffeeShop();
        GUIThemeFactory factory = new DarkThemeFactory();

        CoffeeOrderApp app = new CoffeeOrderApp(shop, factory);
        app.displayOrderInterface();

        // Test with different coffee types
        System.out.println("\n=== Testing Different Coffee Types ===");
        app.setCoffeeType("Espresso");
        app.displayOrderInterface();

        System.out.println("\n=== Testing Different Coffee Types ===");
        app.setCoffeeType("Latte");
        app.displayOrderInterface();
    }
}