/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m10.s11;

import java.util.HashMap;
import java.util.Map;

/**
 * HashMap
 */
public class HashMapExample {
    /**
     * Some HashMap functionality
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        var temp = Map.ofEntries( //
                Map.entry("Bob", 18944), //
                Map.entry("Kim", 75491), //
                Map.entry("Tim", 52318));

        // copy constructor for map
        Map<String, Integer> map = new HashMap<>(temp);
        System.out.println("HashMap: " + map);

        // new entry, no previous value
        Integer prev = map.put("Tom", 65773);
        if (prev == null) {
            System.out.println("New entry added");
        }

        // key is already there, the old value is returned
        prev = map.put("Tom", 77365);
        if (prev != null) {
            System.out.println("Previous value was " + prev);
        }

        // get the value associated to the key
        Integer current = map.get("Bob");
        if (current != null) {
            System.out.println("Bob number is " + current);
        }

        current = map.get("Wim");
        if (current == null) {
            System.out.println("Wim is not in the map");
        }

        // check if Tom is in the map
        if (map.containsKey("Tom")) {
            System.out.println("Tom is in the map");
        }

        // remove an entry, if the key exists, and return its value
        prev = map.remove("Tom");
        if (prev != null) {
            System.out.println("Tom removed, its number was " + prev);
        }

        prev = map.remove("Tom");
        if (prev == null) {
            System.out.println("Can't remove Tom, is not in the map");
        }

        if (map.containsValue(52318)) {
            System.out.println("There is at least an entry with the specified value");
        }
    }
}
