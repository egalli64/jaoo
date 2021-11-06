package com.example.jse.m13.s03;

import java.util.Arrays;
import java.util.List;

public class MethodReferenceExample {
    public static void main(String[] args) {
        String[] names = { "tom", "Bob", "kelly", "Ted" };
        System.out.println("As created: " + Arrays.toString(names));

        Arrays.sort(names);
        System.out.println("Natural order: " + Arrays.toString(names));

        // more compact than (left, right) -> left.compareToIgnoreCase(right)
        Arrays.sort(names, String::compareToIgnoreCase);
        System.out.println("Natural order (ignore case): " + Arrays.toString(names));

        List<String> list = List.of(names);
        // meaning: s -> System.out.println(s)
        list.forEach(System.out::println);
    }
}
