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

        // Pet private members are _not_ accessible
//      System.out.println(pet.name);

        // Pet package-private members are accessible
        pet.fleaCount = 3;

        // Pet public members are accessible to everyone
        System.out.println("Count fleas on pet: " + pet.getFleaCount());

        // calling a static method passing a Pet as argument
        makeBill(pet);
    }

    /**
     * A static method
     * 
     * @param pet a pet
     */
    public static void makeBill(Pet pet) {
        // Pet protected members are accessible!
        pet.weight = 1000;
        System.out.println("weight: " + pet.weight);
    }
}
