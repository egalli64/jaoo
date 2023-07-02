/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m7.s9;

import java.io.Serial;
import java.io.Serializable;

/**
 * A serializable class
 */
public class SerialDog implements Serializable {
    @Serial
    private static final long serialVersionUID = 42L;

    private final String name;
    private int barkCount;
    private transient int happinessLevel;

    /**
     * Canonical constructor
     * 
     * @param name           the dog name
     * @param happinessLevel the dog happiness level
     */
    public SerialDog(String name, int happinessLevel) {
        this.name = name;
        this.barkCount = 0;
        this.happinessLevel = happinessLevel;
    }

    /**
     * Setter
     * 
     * @param happinessLevel the new happiness level
     */
    public void setHappinessLevel(int happinessLevel) {
        this.happinessLevel = happinessLevel;
    }

    /**
     * A method
     */
    public void bark() {
        barkCount += 1;
        System.out.printf("%s barks! (%d - %d)%n", name, happinessLevel, barkCount);
    }
}
