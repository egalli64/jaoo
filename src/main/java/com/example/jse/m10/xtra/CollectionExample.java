package com.example.jse.m10.xtra;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class CollectionExample {
    public static void main(String[] args) {
        // concrete types could be _any_ Collection
        boolean flag = Math.random() > 0.5;

        Collection<Integer> collOne = create(flag, 12, 18, -5, -2233);
        Collection<Integer> collTwo = create(!flag);
        collOne.addAll(collTwo);

        // implicit call to the overridden toString() for the variable actual type
        System.out.println("First collection: " + collOne);
        System.out.println("Second collection: " + collTwo);
        if (!collOne.equals(collTwo)) {
            System.out.println("The collections are not equals!");
        }

        Collection<Integer> collTwoCopy = create(!flag);
        collTwoCopy.addAll(collTwo);
        if (collOne.equals(collTwo)) {
            System.out.println("Collections of the same concrete type and with the same (equals) elements");
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
