package com.sadaqatzada.coffeeshop.abstractfactory;

// Light-themed text field implementation
public class LightTextField implements TextField {
    private String text; // Stores text content

    // Renders light-themed text field with current text
    @Override
    public void render() {
        System.out.println("Rendering light-themed text field with text: " + text);
    }

    // Sets the text content for this field
    @Override
    public void setText(String text) {
        this.text = text;
    }

    // Returns the stored text content
    @Override
    public String getText() {
        return "";
    }
}