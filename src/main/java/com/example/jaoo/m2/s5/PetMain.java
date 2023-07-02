/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m2.s5;

import com.example.jaoo.m2.s4.Pet;

/**
 * Access to methods of another class (in another package)
 */
public class PetMain {
    public static void main(String[] args) {
        Pet pet = new Pet("Fido", 3.01);
        System.out.println("Pet name: " + pet.getName());
        pet.setName("Bob");
        System.out.println("Pet name now is: " + pet.getName());
    }
}
