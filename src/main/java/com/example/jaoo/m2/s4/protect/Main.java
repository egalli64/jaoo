/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */

package com.example.jaoo.m2.s4.protect;

/**
 * A bad use of protected
 */
public class Main {
    public static void main(String[] args) {
        Pet pet = new Pet(1.23);
        System.out.println(pet);

        WildCat cat = new WildCat();
        cat.attack(pet);
        System.out.println(pet);
    }
}
