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
    public void attack(Man man) {
        System.out.println("A wolf is attacking " + man);
    }

    /**
     * Overload, a wolfable knows how to attack a man, a wolf know also how to
     * attack another wolf
     * 
     * @param other the attacked wolf
     */
    public void attack(Wolf other) {
        System.out.println("A wolf is attacking " + other);
    }

    @Override
    public String toString() {
        return "A Wolf";
    }
}
