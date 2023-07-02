/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m1.s8;

/**
 * Variable initialization
 */
public class Initialize {
    /**
     * Static and instance variable are implicitly initialized to zero (false/null)
     * <p>
     * Still, explicit initialization is preferred
     */
    private int i; // 0
    private boolean flag; // false
    private String t; // null

    /**
     * a method working with local variables
     */
    public void f() {
        // a plain variable definition hiding a data member - BAD IDEA
        int i = 42;
        // Whenever possible, prefer local variable definition over declaration
        int j;
        // Element array are implicitly initialized as expected (zero/false/null)
        int[] data = new int[10];

        System.out.println(data[3] + i);

        // Compile error: variable j might not have been initialized
//        System.out.println(j);
        j = i / 2;
        System.out.println(j);
    }

    /**
     * a method working with data members
     */
    public void g() {
        System.out.println(t + ", " + i + ", " + flag);
    }
}
