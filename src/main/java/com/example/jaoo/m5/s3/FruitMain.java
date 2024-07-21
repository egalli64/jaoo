/*
 * Introduction to Java base concepts
 * 
 * https://github.com/egalli64/jaba
 */
package com.example.jaoo.m5.s3;

/**
 * Smoke test for an enumeration, it shows the use of the static method values()
 * and the instance method toString()
 */
public class FruitMain {
    public static void main(String[] args) {
        System.out.println("The available fruits:");
        for (Fruit cur : Fruit.values()) {
            System.out.println(cur.description());
        }
    }
}
