package com.example.jse.m05.s04;

public class Main {
    public static void main(String[] args) {
        boolean flag = true;

        // Don't do it - old style way to convert a boolean to string
        String boolAsStringClassic = "" + flag;
        System.out.println("A boolean converted to string: " + boolAsStringClassic);

        // Preferred way - by a String static factory method
        String boolAsStringModern = String.valueOf(flag);
        System.out.println("Another boolean converted to string: " + boolAsStringModern);

        Dog[] dogs = new Dog[3];

        dogs[0] = Dog.createWithName("Bob");
        dogs[1] = Dog.createWithNoName();
        dogs[2] = Dog.createWithBreedButNoName("Bobtail");

        for (Dog dog : dogs) {
            dog.bark();
        }
    }
}
