/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m8.s15;

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
