/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */

package com.example.jaoo.m2.s4.protect;

/**
 * A rogue class
 */
public class WildCat {
    /**
     * The vicious wildcat attack an harmless pet
     * 
     * @param pet the attacked pet
     */
    public void attack(Pet pet) {
        // !!! protected member could be accessed in all the package !!!
        pet.weight /= 2;
    }
}
