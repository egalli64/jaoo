/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m3.s6;

/**
 * Sample class, base of hierarchy. Being abstract, no object of this class
 * could be instantiated.
 */
public abstract class Mammal {
    /** could be accessed by derived classes */
    protected int gestation;

    /**
     * Canonical constructor
     * 
     * @param gestation days to get a new mammal of the provided specific type
     */
    public Mammal(int gestation) {
        this.gestation = gestation;
    }

    /**
     * Every mammal should eat
     */
    public void eat() {
        System.out.println("Gnam!");
    }

    @Override
    public String toString() {
        return "Mammal [gestation=" + gestation + "]";
    }
}
