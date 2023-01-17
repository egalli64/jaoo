/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m06.s16;

/**
 * Marking as final primitive, immutable/mutable references
 */
public class Final {
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

        sb.append('!');
        System.out.println(sb);

        // Won't compile: The final local variable ... cannot be assigned.
//        size += 1;
//        max += 1;
//        sb = new StringBuilder("Goodbye");
    }

    /**
     * A method that can't be overridden
     */
    public final void f() {
    }

    /**
     * A method that can't be hidden
     */
    public static final void g() {
    }
}
