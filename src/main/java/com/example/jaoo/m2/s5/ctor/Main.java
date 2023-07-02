/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m2.s5.ctor;

/**
 * Usage of non-instantiable class MyMath
 */
public class Main {
    public static void main(String[] args) {
        // The constructor MyMath() is not visible
        // MyMath my = new MyMath();

        System.out.println("PI is " + Math.PI);
        System.out.println("Square root of 2 is " + MyMath.SQRT2);

        // it generates an AssertionError
        // MyMath.create();
    }
}
