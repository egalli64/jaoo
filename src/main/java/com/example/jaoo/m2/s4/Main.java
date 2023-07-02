/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m2.s4;

/**
 * Demo for access modifier for data member
 */
public class Main {
    /**
     * Create a Pet and work with it
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        Pet pet = new Pet("Waffle", 2.18);

        // pet's private members are _not_ accessible
//      System.out.println(pet.name);

        // pet's package members are accessible
        System.out.println("count: " + Pet.count);

        makeBill(pet);
    }

    /**
     * A static method
     * 
     * @param pet a pet
     */
    public static void makeBill(Pet pet) {
        // pet's protected members are accessible!
        pet.weight = 1000;
        System.out.println("weight: " + pet.weight);
    }
}
