package com.example.jse.m13.s03;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorExample {
    public static void main(String[] args) {
        String[] names = { "Tom", "Bob", "Bill", "Tony", "Cy" };
        System.out.println("As created: " + Arrays.toString(names));

        Arrays.sort(names);
        System.out.println("Natural alphabetic order: " + Arrays.toString(names));

        // verbose one-liner
        Arrays.sort(names, (String left, String right) -> left.length() - right.length());
        System.out.println("From shorter to longer: " + Arrays.toString(names));

        // compact version
        Arrays.sort(names, (s, t) -> t.length() - s.length());
        System.out.println("From longer to shorter: " + Arrays.toString(names));

        // a few pre-built utility comparators are available
        Arrays.sort(names, Comparator.reverseOrder());
        System.out.println("Reversed alphabetic order: " + Arrays.toString(names));

        // a longer lambda
        Arrays.sort(names, (left, right) -> {
            int comparison = right.length() - left.length();
            return comparison == 0 ? left.compareTo(right) : comparison;
        });
        System.out.println("From longer to shorter (then alpha): " + Arrays.toString(names));
    }
}
