/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m5.s3;

/**
 * Smoke test for an enumeration, it shows the use of the static method values()
 * and the instance method toString()
 */
public class DayMain {
    public static void main(String[] args) {
        System.out.println("The available weekdays:");
        for (Day cur : Day.values()) {
            System.out.println(cur);
        }
    }
}
