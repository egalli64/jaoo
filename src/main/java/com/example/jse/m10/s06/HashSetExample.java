/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m10.s06;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * HashSet
 */
public class HashSetExample {
    /**
     * A few methods from HashSet
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>(List.of(5, 8, 99));
        System.out.println("The set: " + set);

        set.add(12);
        if (set.contains(12)) {
            System.out.println("12 is now in the set");
        }
        if (!set.add(12)) {
            System.out.println("No duplicated object in a set!");
        }
        if (!set.remove(42)) {
            System.out.println("Can't remove object not in the set");
        }

        System.out.print("The final elements: ");
        for (Integer cur : set) {
            System.out.print(cur + " ");
        }
        System.out.println();
    }
}
