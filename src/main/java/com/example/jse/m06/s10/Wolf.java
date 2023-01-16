/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m06.s10;

/**
 * Wolf is a Wolfable
 */
public class Wolf implements Wolfable {
    @Override
    public void howl() {
        System.out.println("Woul");
    }

    @Override
    public String toString() {
        return "A Wolf";
    }

    @Override
    public void attack(Man man) {
        System.out.printf("A wolf is attacking %s%n", man);
    }
}
