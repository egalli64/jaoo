/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m5.s3;

/**
 * Smoke test for an enriched enumeration, it also shows the use of custom
 * method description()
 */
public class FruitMain {
    public static void main(String[] args) {
        System.out.println("The available fruits:");
        for (Fruit cur : Fruit.values()) {
            System.out.println(cur.description());
        }
    }
}
