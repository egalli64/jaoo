/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m5.s2;

/**
 * Using final on variables
 */
public class FinalVariables {
    /** A class constant */
    public static final int THE_SOLUTION = 42;

    /**
     * Some final examples
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        final int size = 12;
        final Integer max = 12;
        final StringBuilder sb = new StringBuilder("hello");

        System.out.println(size + 1);
        System.out.println(max + 1);
        System.out.println("The solution is " + THE_SOLUTION);

        // final on a reference to mutable, the object can change
        sb.append('!');
        System.out.println(sb);

        // Won't compile: The final local variable ... cannot be assigned.
//        size += 1;
//        max += 1;
//        sb = new StringBuilder("Goodbye");
    }
}
