/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m1.s4;

/**
 * Static factory method
 */
public class Main {
    /**
     * Create object without calling explicitly "new"
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        boolean flag = true;

        // !!! Don't do it - but you can see it in legacy code !!!
        // Old style way to convert anything to string
        String boolAsStringClassic = "" + flag;
        System.out.println("A boolean converted to string: " + boolAsStringClassic);

        // Preferred way - by a String static factory method
        String boolAsStringModern = String.valueOf(flag);
        System.out.println("Another boolean converted to string: " + boolAsStringModern);

        Dog[] dogs = new Dog[4];

        dogs[0] = Dog.createAnonymous();
        dogs[1] = Dog.createWithName("Bob");
        dogs[2] = Dog.createWithBreed("Bobtail");
        dogs[3] = Dog.createWithNameAndBreed("Tim", "Poodle");

        for (Dog dog : dogs) {
            dog.bark();
        }
    }
}
