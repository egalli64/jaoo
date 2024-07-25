/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m1.s5;

/**
 * Boxing char
 */
public class BoxingChar {
    /**
     * Create char objects
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        // a primitive char
        char c = '*';

        // the static factory method valueOf() is the preferred way for boxing
        Character boxed = Character.valueOf(c);

        // the use of constructor is deprecated for removal since Java 9
        @SuppressWarnings("removal")
        Character boxed2 = new Character(c);

        System.out.printf("A couple of boxed characters: %c, %c\n", boxed, boxed2);
    }
}
