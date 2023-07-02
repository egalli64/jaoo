/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m2.s4.other;

import com.example.jaoo.m2.s4.Pet;

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
