/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m05.s03;

/**
 * Show constructor at work
 */
public class Main {
    public static void main(String[] args) {
        Dog tom = new Dog("Tom", "Alsatian");
        tom.bark();

        // no constructor for Dog called, we have six null here
        Dog[] dogs = new Dog[6];

        // a dog created with a given name
        dogs[0] = new Dog("Bob");
        // put a reference to a dog in the array
        dogs[1] = tom;
        for (int i = 2; i < dogs.length - 1; i++) {
            // each time a dog is created with default name and breed
            dogs[i] = new Dog();
        }
        // a dog is created with give name and breed
        String name = "Bill";
        String breed = "Fox Terrier";
        dogs[dogs.length - 1] = new Dog(name, breed);

        // let all the dogs bark!
        for (Dog dog : dogs) {
            dog.bark();
        }
    }
}
