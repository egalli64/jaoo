/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m1.s7.example;

/**
 * Scope example
 */
public class Dog {
    /** dog counter at class level */
    private static int count = 0;
    /** bark counter at class level */
    private static int barkCount = 0;
    /** Each dog has its own current bark count */
    private int currentBarkCount;
    /** Each dog has its own name */
    private String name;

    /**
     * Constructor
     * 
     * @param name the dog name
     */
    public Dog(String name) {
        this.name = name;
        this.currentBarkCount = 0;
        Dog.count += 1;
    }

    /**
     * Canonical constructor
     * 
     * @param name             the dog name
     * @param barkCountCurrent the historical count of dog barks
     */
    public Dog(String name, int barkCountCurrent) {
        this.name = name;
        this.currentBarkCount = barkCountCurrent;
        Dog.count += 1;
    }

    /**
     * Let the dog bark, increase the count of all-dog barks and current-dog barks
     */
    public void bark() {
        Dog.barkCount += 1;
        currentBarkCount += 1;
        System.out.println(this.name + " bark! (" + Dog.barkCount + ")");
        if (currentBarkCount > 1) {
            double rate = (double) currentBarkCount / Dog.barkCount;
            System.out.println("Bark rate: " + rate);
        }
    }

    /**
     * Getter for the dog counter
     * 
     * @return the dog counter
     */
    public static int getCount() {
        return Dog.count;
    }

    /**
     * Getter for the all-dog bark counter
     * 
     * @return the bark count
     */
    public static int getBarkCount() {
        return Dog.barkCount;
    }

    /**
     * Getter for the current-dog bark counter
     * 
     * @return the current dog bark count
     */
    public int getBarkCountCurrent() {
        return currentBarkCount;
    }

    @Override
    public String toString() {
        return "Dog [currentBarkCount=" + currentBarkCount + ", name=" + name + "]";
    }
}
