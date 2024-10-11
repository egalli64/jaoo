/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m2.s5.getSet;

public class Main {
    public static void main(String[] args) {
        String inputColor = "blue";
        int inputDisp = 1_300;
        int[] inputPrices = { 10_000 };

        Car car = new Car(inputColor, inputDisp, inputPrices);
        System.out.println(car);

        // changing the input prices should not change the car prices
        inputPrices[0] *= 2;

        String color = car.getColor();
        System.out.println(color);

        int disp = car.getDisplacement();
        System.out.println(disp);
    }
}
