package com.example.jse.m10.s08;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        List<Integer> data = List.of(5, 8, 99);

        Set<Integer> set = new TreeSet<>(data);
        System.out.println("The (sorted) set: " + set);

        if (set.add(42)) {
            System.out.println("New element added");
        }
        if (set.contains(99)) {
            System.out.println("The set contains the specified element");
        }
        if (!set.remove(81)) {
            System.out.println("Can't remove an object not in the set");
        }
        System.out.println("The modified set, still sorted: " + set);

        class MyIntComparator implements Comparator<Integer> {
            @Override
            public int compare(Integer x, Integer y) {
                return Integer.compare(x, y);
            }
        }

        MyIntComparator msc = new MyIntComparator();

        Set<Integer> ts2 = new TreeSet<>(msc);
        ts2.addAll(set);
        System.out.println("A tree initialized with a comparator (same as default): " + ts2);

        Set<Integer> ts3 = new TreeSet<>(msc.reversed());
        ts3.addAll(set);
        System.out.println("A tree initialized with a reversed comparator: " + ts3);

        Set<Integer> ts4 = new TreeSet<>((x, y) -> y.compareTo(x));
        ts4.addAll(set);
        System.out.println("A tree initialized with a lambda comparator: " + ts4);
    }
}
