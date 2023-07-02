/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m2.s2;

/**
 * The disadvantages of breaking data hiding
 */
public class NoDataHiding {
    /**
     * Create and use a dog object, violating data hiding
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        Dog dog = new Dog();

        // The user can change the dog name in a silly way!
        dog.name = "*!_";
        System.out.println("Dog name set to " + dog.getName());

        // The user should use a Dog method to change its state
        Dog dog2 = new Dog();

        dog2.setName("|||");
        System.out.println(dog2.getName());
        dog2.setName(null);
        System.out.println(dog2.getName());
        dog2.setName("Tom");
        System.out.println(dog2.getName());
    }
}
