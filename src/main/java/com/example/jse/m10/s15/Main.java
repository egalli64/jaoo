/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m10.s15;

/**
 * Comparable
 */
public class Main {
    /**
     * Smoke test on a comparable class
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        Dog tomBob = new Dog("Tom", "Bob");
        Dog tomCarl = new Dog("Tom", "Carl");
        if (tomBob.compareTo(tomCarl) < 0) {
            System.out.println("Tom-Bob is before Tom-Carl");
        } else {
            System.out.println("Unexpected");
        }
    }
}
