package com.example.jse.m10x.s04;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.addLast(3);
        ll.addFirst(2);
        System.out.println("First element is " + ll.getFirst());
        System.out.println("Last element is " + ll.getLast());

        // same as addLast()
        ll.add(9);

        // potentially expensive operations
        ll.add(2, 4);
        ll.set(2, 99);
        Integer middle = ll.get(ll.size() / 2);
        System.out.println("Central(ish) element: " + middle);
        System.out.println("Removed element: " + ll.remove(2));

        LinkedList<Integer> copy = new LinkedList<>(ll);
        System.out.println("Copied list: " + copy);

        // add ones before each existing elements
        ListIterator<Integer> lit = ll.listIterator();
        while (lit.hasNext()) {
            lit.add(1);
            lit.next();
        }

        // remove even elements
        while (lit.hasPrevious()) {
            Integer value = lit.previous();
            if (value % 2 == 0) {
                lit.remove();
            }
        }

        System.out.println("Modified list: " + ll);
    }
}
