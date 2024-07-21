/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m5.s6;

/**
 * Using objects in a sealed-based hierarchy
 */
public class SealedMain {
    public static void main(String[] args) {
        Brushable[] brushables = { new Dog("Bob"), new TeddyBear("Ted") };
        for (Brushable brushable : brushables) {
            brushable.brush();
        }

        Pet[] pets = { new Dog("Zip"), new Cat("Tom"), new Tabby("Kim"), new OrangeTabby("Pit") };
        for (Pet pet : pets) {
            pet.feeding();
        }
    }
}
