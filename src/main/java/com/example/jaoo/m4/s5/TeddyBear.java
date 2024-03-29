/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m4.s5;

/**
 * A record implementing a sealed interface
 */
record TeddyBear(String name) implements Brushable {
    @Override
    public void brush() {
        System.out.println("Brushing teddy bear " + name);
    }
}
