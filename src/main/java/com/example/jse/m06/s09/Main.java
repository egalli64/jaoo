/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m06.s09;

/**
 * Class - interface relation
 */
public class Main {
    /**
     * A few object with is-a and has-a relations
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        Mammal[] mammals = { new Dog(63), new Cat(63, 20), new Horse(350, 48) };

        for (Mammal mammal : mammals) {
            System.out.println(mammal.toString());
        }

        for (int i = 0; i < mammals.length; i++) {
            System.out.println(mammals[i].toString());
        }

        Barking barker = new Dog(62, 42);
        barker.bark();

        Neighing n = new Horse(340, 55);
        n.neigh();

        Dog dog = new Dog(12, 12);
        System.out.println(dog.toString());
        System.out.println(23);
        dog.eat();
        dog.bark();
    }
}
