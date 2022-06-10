package com.example.jse.m10x.s09;

import java.util.EnumSet;

public class EnumSetExample {
    public static void main(String[] args) {
        EnumSet<Size> allSizes = EnumSet.allOf(Size.class);
        System.out.println("All available sizes:");
        allSizes.forEach(System.out::println);
        System.out.println("---");

        EnumSet<Size> empty = EnumSet.noneOf(Size.class);
        System.out.println("No available size:");
        empty.forEach(System.out::println);
        System.out.println("---");

        EnumSet<Size> couple = EnumSet.of(Size.XS, Size.L);
        System.out.println("A couple of available sizes:");
        couple.forEach(System.out::println);
        System.out.println("---");

        EnumSet<Size> range = EnumSet.range(Size.XS, Size.L);
        System.out.println("A range of available sizes:");
        range.forEach(System.out::println);
        System.out.println("---");

        if (empty.isEmpty()) {
            System.out.println("No surprise ... add a size");
            empty.add(Size.M);
        }

        if (!empty.isEmpty() && empty.contains(Size.M)) {
            System.out.println(" ... and then remove it");
            empty.remove(Size.M);
            System.out.println("Back to emptiness, size is " + empty.size());
        }
    }
}
