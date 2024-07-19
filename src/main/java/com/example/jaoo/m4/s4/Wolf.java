/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m4.s4;

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
