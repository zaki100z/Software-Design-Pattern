package com.sadaqatzada.coffeeshop.abstractfactory;

// Interface for text field UI components
public interface TextField {
    // Renders the text field on screen
    void render();

    // Sets the text content
    void setText(String text);

    // Returns the text content
    String getText();
}