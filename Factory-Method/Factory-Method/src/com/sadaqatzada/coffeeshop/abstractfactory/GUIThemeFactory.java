package com.sadaqatzada.coffeeshop.abstractfactory;

// Factory interface for creating UI theme components
public interface GUIThemeFactory {
    // Creates a button component
    Button createButton();

    // Creates a panel component
    Panel createPanel();

    // Creates a text field component
    TextField createTextField();
}