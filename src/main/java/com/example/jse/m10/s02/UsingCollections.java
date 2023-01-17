/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m10.s02;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Collections
 */
public class UsingCollections {
    /**
     * Some methods from Collections
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        Collection<Integer> coll = List.of(4, 2, 6, 1);

        System.out.println("The collection: " + coll);
        System.out.println("max: " + Collections.max(coll));
        System.out.println("min: " + Collections.min(coll));
    }
}
