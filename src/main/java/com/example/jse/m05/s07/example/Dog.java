/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m05.s07.example;

/**
 * Scope example
 */
public class Dog {
    private static int count = 0;
    private static int barkCount = 0;
    /** Each dog has its own current bark count */
    private int currentBarkCount;
    /** Each dog has its own name */
    private String name;

    public Dog(String name) {
        this.name = name;
        this.currentBarkCount = 0;
        Dog.count += 1;
    }

    public Dog(String name, int barkCountCurrent) {
        this.name = name;
        this.currentBarkCount = barkCountCurrent;
        Dog.count += 1;
    }

    public void bark() {
        Dog.barkCount += 1;
        currentBarkCount += 1;
        System.out.println(this.name + " bark! (" + Dog.barkCount + ")");
        if (currentBarkCount > 1) {
            double rate = (double) currentBarkCount / Dog.barkCount;
            System.out.println("Bark rate: " + rate);
        }
    }

    public static int getCount() {
        return Dog.count;
    }

    public static int getBarkCount() {
        return Dog.barkCount;
    }

    public int getBarkCountCurrent() {
        return currentBarkCount;
    }

    @Override
    public String toString() {
        return "Dog [currentBarkCount=" + currentBarkCount + ", name=" + name + "]";
    }
}
