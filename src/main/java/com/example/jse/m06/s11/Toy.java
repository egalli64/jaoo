/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m06.s11;

/**
 * A sample base class
 */
public class Toy {
    private int price;

    /**
     * Canonical constructor
     * 
     * @param price toy price
     */
    public Toy(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Toy [price=" + price + "]";
    }
}
