/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m8.xtra;

import java.util.HashMap;
import java.util.Map;

public class MapFactoryExample {
    public static void main(String[] args) {
        classic();
        mapOf();
        mapOfEntries();
    }

    private static void classic() {
        Map<Integer, String> map = new HashMap<>();
        map.put(7, "seven");
        map.put(42, "fortytwo");
        System.out.println("Plain map initialization: " + map);
    }

    private static void mapOf() {
        Map<Integer, String> map = Map.of(7, "seven", 42, "fortytwo");
        System.out.println("Map.of(): " + map);

        try {
            map.put(12, "twelve");
        } catch (UnsupportedOperationException ex) {
            System.out.println("Can't call put(), it throws a " + ex);
        }
    }

    private static void mapOfEntries() {
        Map<Integer, String> map = Map.ofEntries(Map.entry(7, "seven"), Map.entry(42, "fortytwo"));
        System.out.println("Map.ofEntries(): " + map);
    }
}
