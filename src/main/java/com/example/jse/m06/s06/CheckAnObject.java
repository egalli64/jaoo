/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m06.s06;

/**
 * Looking at Object
 */
public class CheckAnObject {
    /**
     * Using a few Object methods.
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        Object o = new Object();
        Object o2 = new Object();

        System.out.println("Two different objects are equal? " + o.equals(o2));
        System.out.printf("Hash code of two different object: %d %d%n", o.hashCode(), o2.hashCode());
        System.out.println("An object as string: " + o.toString());
    }
}
