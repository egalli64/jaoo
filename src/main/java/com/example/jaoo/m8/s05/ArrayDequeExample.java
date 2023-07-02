/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m8.s05;

import java.util.ArrayDeque;
import java.util.List;

/**
 * ArrayDeque
 */
public class ArrayDequeExample {
    /**
     * Using push() and pop() on ArrayDeque
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        ArrayDeque<Integer> ad = new ArrayDeque<>(List.of(42, -27, 99, 12));
        System.out.println(ad);

        ad.push(18);
        System.out.println("Stack: push adds new first (left) element " + ad);

        Integer popped = ad.pop();
        System.out.println("Stack: pop removes the first (left) element " + popped);
        System.out.println(ad);
    }
}
