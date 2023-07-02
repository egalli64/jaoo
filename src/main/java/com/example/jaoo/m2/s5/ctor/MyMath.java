/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m2.s5.ctor;

/**
 * This class is just a namespace
 */
public class MyMath {
    /** Default solution for any problem */
    public static final int SOLUTION = 42;

    /** Square root of 2 */
    public static final double SQRT2 = 1.4142135623730951;

    /**
     * Don't let anyone instantiate this class
     */
    private MyMath() {
        throw new AssertionError();
    }

    /**
     * !!! DO NOT DO THIS !!!
     * 
     * @return nothing, never
     * @throws AssertionError always
     */
    public static MyMath create() {
        return new MyMath();
    }
}
