/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m4.s3;

/**
 * A sample base class
 */
public class Toy {
    private int price;
    private int discount;

    /**
     * Canonical constructor
     * 
     * @param price toy price
     */
    public Toy(int price) {
        this.price = price;
        this.discount = 0;
    }

    public Toy(int price, int discount) {
        this.price = price;
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "Toy [price=" + price + ", discount=" + discount + "]";
    }
}
