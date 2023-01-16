/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m06.s04.other;

import com.example.jse.m06.s04.Pet;

/**
 * A sample subclass of a class in _another_ package
 */
public class PetSub extends Pet {
    /**
     * Canonical constructor
     * 
     * @param name   dog name
     * @param weight dog weight
     */
    public PetSub(String name, double weight) {
        super(name, weight);
    }

    /**
     * A method in a subclass
     */
    public void f() {
        // super's protected members are accessible
        weight += 10;
        System.out.println(weight);

        // super's private members are _not_ accessible
//        System.out.println(name);

        // super's package members are _not_ accessible - static or not
//        System.out.println(Pet.count);
    }
}
