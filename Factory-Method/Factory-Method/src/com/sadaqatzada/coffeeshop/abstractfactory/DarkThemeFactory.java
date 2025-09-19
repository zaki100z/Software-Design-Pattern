package com.sadaqatzada.coffeeshop.abstractfactory;

// Factory for creating dark-themed UI components
public class DarkThemeFactory implements GUIThemeFactory {

    // Creates a dark-themed button
    @Override
    public Button createButton() {
        return new DarkButton();
    }

    // Creates a dark-themed panel
    @Override
    public Panel createPanel() {
        return new DarkPanel();
    }

    // Creates a dark-themed text field
    @Override
    public TextField createTextField() {
        return new DarkTextField();
    }
}