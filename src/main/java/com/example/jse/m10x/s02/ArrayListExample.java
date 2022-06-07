package com.example.jse.m10x.s02;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        List<Integer> list0 = new ArrayList<>();
        recap("An empty list", list0);

        List<Integer> list1 = new ArrayList<Integer>(5);
        recap("An empty list w/ given (5) capacity", list1);

        list1.add(56);
        list1.add(0, 18);
        list1.add(42);
        recap("After adding elements", list1);

        ArrayList<Integer> list2 = new ArrayList<>(list1);
        recap("A list by copy constructor", list2);

        Integer value = list2.get(0);
        System.out.println("Value at the beginning: " + value);

        list2.set(list2.size() - 1, 11);
        list2.remove(1);

        recap("After changing the last element and removing the middle one", list2);
    }

    private static void recap(String message, List<?> lst) {
        System.out.printf("%s: %s, current size %d%n", message, lst, lst.size());
    }
}
