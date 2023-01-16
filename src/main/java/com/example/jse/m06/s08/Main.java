/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m06.s08;

/**
 * Interface
 */
public class Main {
    /**
     * Using interfaces
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        // access constants defined in interfaces
        System.out.println(Explicit.XYZ);
        System.out.println(WeekDay.TUESDAY);
        
        Modern.f();

        Modern m = new Modern() {
        };

        m.c("hello");

        ModernFunctional mf = () -> System.out.println("Hello Functional Programming in Java");
        mf.example();
    }
}
