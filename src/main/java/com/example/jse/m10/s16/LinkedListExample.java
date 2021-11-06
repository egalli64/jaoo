package com.example.jse.m10.s16;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8));
        System.out.println(ll);

        ListIterator<Integer> lit = ll.listIterator();
        while (lit.hasNext()) {
            Integer value = lit.next();
            if (value % 2 == 0) {
                // On a linked list this is a O(1) operation
                lit.remove();
            } else if (value == 5) {
                lit.add(100);
            }
        }

        System.out.println(ll);
    }
}
