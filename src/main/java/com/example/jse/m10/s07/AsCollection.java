package com.example.jse.m10.s07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class AsCollection {
    public static void main(String[] args) {
        // concrete types could be _any_ Collection
        Collection<Integer> collOne = create(true);
        Collection<Integer> collTwo = create(true, 12, 18, -5, -2233);

        collOne.addAll(collTwo);
        // implicit call to the overridden toString() for the variable actual type
        System.out.println("Working with this collection: " + collOne);

        if (collOne.contains(-2233)) {
            System.out.println("-2233 is there");
        }

        if (collOne.equals(collTwo)) {
            System.out.println("Collections of the same concrete type and with the same (equals) elements");
        }

        collOne.add(42);
        if (!collOne.equals(collTwo)) {
            System.out.println("The collections are not equals");
        }

        System.out.print("This collection has " + collOne.size() + " elements: ");
        Iterator<Integer> it = collOne.iterator();
        while (it.hasNext()) {
            Integer current = it.next();
            System.out.print(current + " ");

            // same, one-liner
//            System.out.print(it.next() + " ");
        }
        System.out.println();

        // for-each hides the iterator
        System.out.print("Again: ");
        for(Integer current: collOne) {
            System.out.print(current + " ");
        }
        System.out.println();

        if (collOne.remove(-5)) {
            System.out.println("Element -5 removed");
        }

        System.out.print("Converting a collection to an array: ");
        Integer[] values = new Integer[collOne.size()];
        values = collOne.toArray(values);

        // same, one-liner
//        Integer[] values = collOne.toArray(new Integer[collOne.size()]);
        System.out.println(Arrays.toString(values));

        collOne.removeIf(x -> x > 20);
        System.out.println("After removing values over 20: " + collOne);

        collOne.clear();
        System.out.println("After clear(), a collection is empty? " + collOne.isEmpty());
    }

    public static Collection<Integer> create(boolean flag, Integer... values) {
        List<Integer> input = List.of(values);
        return flag ? new HashSet<>(input) : new ArrayList<>(input);
    }
}
