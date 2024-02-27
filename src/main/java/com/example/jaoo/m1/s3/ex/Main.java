/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m1.s3.ex;

import java.util.Arrays;

/**
 * Exercise: create a few cats and let them meow accordingly to requests
 */
public class Main {
    /**
     * Follow the instructions in the "to do" comments.
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        String[] names = { "Tom", "Bob", "Kit", "Zip", "Kit" };
        String[] colors = { "blue", "green", "yellow", "black", "blue" };

        System.out.println("The cats names: " + Arrays.toString(names));
        System.out.println("The cats colors: " + Arrays.toString(colors));

        // TODO 1: create an array of cats, same size of the arrays above
        Cat[] cats = new Cat[0];
        System.out.println("The array of cats length is " + cats.length);

        // TODO 2: initialize the cats array
        // each cat should have name and color from the arrays above

        // TODO 3: each cat should meow

        // TODO 4: each cat named Kit should meow

        // TODO 5: only the first cat named Kit should meow

        // TODO 6: only the cats in even position should meow
    }
}
