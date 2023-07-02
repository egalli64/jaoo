/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m8.s10;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/**
 * Map
 */
public class MapExample {
    /**
     * Creating and accessing a map
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        Map<String, Integer> phones = Map.of("Tom", 42212);
        System.out.println("A map: " + phones);

        Map.Entry<String, Integer> bob = Map.entry("Bob", 18944);
        Map.Entry<String, Integer> kim = Map.entry("Kim", 75491);
        Map.Entry<String, Integer> tim = Map.entry("Tim", 52318);
        Map<String, Integer> others = Map.ofEntries(bob, kim, tim);
        System.out.println("Another map: " + others);

        // views
        Set<Map.Entry<String, Integer>> entries = others.entrySet();
        System.out.println("All entries: " + entries);

        Set<String> keys = others.keySet();
        System.out.println("All keys: " + keys);

        Collection<Integer> values = others.values();
        System.out.println("All values: " + values);
    }
}
