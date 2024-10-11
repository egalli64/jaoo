/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m2.s7.over;

/**
 * Override vs overload
 */
public class Main {
    public static void main(String[] args) {
        Pet[] pets = { new Dog(), new Pet() };

        // override
        for (Pet pet : pets) {
            pet.eat();
        }

        // override
        for (Pet pet : pets) {
            System.out.println(pet.toString());
        }

        Dog dog = new Dog();
        // overload
        dog.eat();
        dog.eat(2);

        // overload
        System.out.println(43);
        System.out.println("ciao");
    }
}
