package com.sadaqatzada.coffeeshop.abstractfactory;

// Factory for creating light-themed UI components
public class LightThemeFactory implements GUIThemeFactory {

    // Creates a light-themed button
    @Override
    public Button createButton() {
        return new LightButton();
    }

    // Creates a light-themed panel
    @Override
    public Panel createPanel() {
        return new LightPanel();
    }

    // Creates a light-themed text field
    @Override
    public TextField createTextField() {
        return new LightTextField();
    }
}