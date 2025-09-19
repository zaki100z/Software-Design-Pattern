package com.sadaqatzada.coffeeshop.abstractfactory;

// Dark-themed text field implementation
public class DarkTextField implements TextField {
    private String text; // Stores text content

    // Renders dark-themed text field with current text
    @Override
    public void render() {
        System.out.println("Rendering dark-themed text field with text: " + text);
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