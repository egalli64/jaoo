/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m06.s05;

import com.example.jse.m06.s04.Pet;

/**
 * Access to methods of another class (in another package)
 */
public class PetMain {
    public static void main(String[] args) {
        Pet pet = new Pet();
        System.out.println("Pet name: " + pet.getName());
        pet.setName("Bob");
        System.out.println("Pet name now is: " + pet.getName());
    }
}
