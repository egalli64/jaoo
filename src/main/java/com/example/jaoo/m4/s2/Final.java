/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m4.s2;

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
        String s;
    }

    /**
     * A method that can't be hidden
     */
    public static final void g() {
    }
}
