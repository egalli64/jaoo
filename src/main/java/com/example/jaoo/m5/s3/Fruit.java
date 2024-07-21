/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m5.s3;

/**
 * An enumerator with custom behavior
 */
public enum Fruit {
    APPLE("red", 350), BANANA("yellow", 150), ORANGE("orange", 250), GRAPE("white", 400);

    private final String color;
    private final int price; // in cents

    /**
     * Canonical constructor
     * 
     * @param color the fruit color
     * @param price the fruit price (in cents)
     */
    Fruit(String color, int price) {
        this.color = color;
        this.price = price;
    }

    public String color() {
        return color;
    }

    public int price() {
        return price;
    }

    public String description() {
        return String.format("The %s is %s, price is %.2f€ for kg", toString().toLowerCase(), color, price / 100.0);
    }
}
