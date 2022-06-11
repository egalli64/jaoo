package com.example.jse.m10.s12;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        var temp = Map.ofEntries( //
                Map.entry("Tim", 18944), //
                Map.entry("Kim", 75491), //
                Map.entry("Bob", 52318));

        // copy ctor for map
        Map<String, Integer> map = new TreeMap<>(temp);
        System.out.println("TreeMap: " + map);

        // new entry, no previous value
        Integer prev = map.put("Dan", 65773);
        if (prev == null) {
            System.out.println("New entry added");
        }

        System.out.println("After insering Dan: " + map);

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

        // get the value, or the expected default
        Integer value = map.getOrDefault("Missing", 0);
        if (value == 0) {
            System.out.println("The passed key is not in the map");
        }

        value = map.getOrDefault("Tim", 0);
        if (value != 0) {
            System.out.println("The number associated to Tim is " + value);
        }

        // put a new element, only if the key is not already in
        current = map.putIfAbsent("Tim", 0);
        if (current != null) {
            System.out.println("Tim is already in, value " + current);
        }

        current = map.putIfAbsent("Wim", 84061);
        if (current == null) {
            System.out.println("Wim added");
        }

        // change the value, do nothing if key is not already in
        prev = map.replace("Les", 0);
        if (current == null) {
            System.out.println("Can't replace a value if key is not in");
        }

        prev = map.replace("Wim", 96851);
        if (prev != null) {
            System.out.println("Previous value for Wim: " + prev);
        }
    }
}
