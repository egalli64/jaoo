package com.example.jse.m06.s04;

public class Main {
    public static void main(String[] args) {
        Pet pet = new Pet();

        // pet's private members are _not_ accessible
//      System.out.println(pet.name);

        // pet's package members are accessible
        System.out.println("count: " + Pet.count);

        makeBill(pet);
    }

    public static void makeBill(Pet pet) {
        // pet's protected members are accessible!
        pet.weight = 1000;
        System.out.println("weight: " + pet.weight);
    }
}
