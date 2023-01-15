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
        // no constructor for Dog called, we have six null here
        Dog[] dogs = new Dog[6];

        // a dog created with a given name
        dogs[0] = new Dog("Bob");
        for (int i = 1; i < dogs.length - 1; i++) {
            // each time a dog is created with default name and breed
            dogs[i] = new Dog();
        }
        // a dog is created with give name and breed
        dogs[dogs.length - 1] = new Dog("Bill", "Fox Terrier");

        // let all the dogs bark!
        for (Dog dog : dogs) {
            dog.bark();
        }
    }
}
