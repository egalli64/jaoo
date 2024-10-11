/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m2.s5.getSet;

import java.util.Arrays;

/**
 * A class abusing of getters and setters
 */
public class Car {
    private String color;
    private int displacement;
    private int[] prices;

    /**
     * Constructor
     * 
     * @param color        the car color
     * @param displacement the car displacement
     * @param prices       the car prices
     */
    public Car(String color, int displacement, int[] prices) {
        this.color = color;
        this.displacement = displacement;
        this.prices = Arrays.copyOf(prices, prices.length);
    }

    /**
     * Getter
     * 
     * @return a copy of the prices
     */
    public int[] getPrices() {
        return Arrays.copyOf(prices, prices.length);
    }

    /**
     * Setter
     * 
     * @param prices copied in
     */
    public void setPrices(int[] prices) {
        this.prices = Arrays.copyOf(prices, prices.length);
    }

    /**
     * Getter
     * 
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * Setter
     * 
     * @param color change the car color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Getter
     * 
     * @return the displacement
     */
    public int getDisplacement() {
        return displacement;
    }

    /**
     * Setter
     * 
     * @param displacement change the car displacement
     */
    public void setDisplacement(int displacement) {
        this.displacement = displacement;
    }

    @Override
    public String toString() {
        return "Car [color=" + color + ", displacement=" + displacement + ", prices=" + Arrays.toString(prices) + "]";
    }
}
