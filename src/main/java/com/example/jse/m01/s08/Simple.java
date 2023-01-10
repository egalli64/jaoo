/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m01.s08;

/**
 * Primitive vs reference type
 */
public class Simple {
    /**
     * In a primitive variable is stored the actual value. In a reference variable
     * is store the reference to the object containing the actual value.
     * <p>
     * In Java we can't access variable memory addresses, here I use its identity
     * hash code to sort of simulate it.
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        // a variable storing an integer
        int value = 42;
        // a variable storing a reference to the object "Bob" somewhere in the heap
        String name = "Bob";

        // null means no object to reference - primitives do not have this concept
        String other = null;

        System.out.println(value);
        System.out.print(Integer.toHexString(System.identityHashCode(name)));
        System.out.print(" [\"reference\" -> object] ");
        System.out.println(name);
        System.out.println(other);
    }
}
