/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m05.s07.example;

import java.util.Arrays;

/**
 * Smoke test for variable scope example
 * 
 * @see Dog the checked class
 */
public class Main {
    /**
     * Works with dogs
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        Dog[] myDogs = new Dog[10];

        System.out.println("# dogs: " + Dog.getCount());
        System.out.println("# barks: " + Dog.getBarkCount());

        for (int i = 0; i < 10; i++) {
            myDogs[i] = new Dog("Tom " + i);
        }

        System.out.println("Dogs: " + Arrays.toString(myDogs));
        System.out.println("# dogs: " + Dog.getCount());

        myDogs[3].bark();
        myDogs[3].bark();
        myDogs[7].bark();
        myDogs[7].bark();

        System.out.println("Dog 3 barks: " + myDogs[3].getBarkCountCurrent());
    }
}
