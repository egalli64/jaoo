package com.example.jse.m10x.s01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Iterating {
    public static void main(String[] args) {
        Collection<Integer> coll = new ArrayList<>(List.of(3, 6, 1, 9, 2));
        System.out.println("The collection: " + coll);

        // remove even values
        Iterator<Integer> it = coll.iterator();
        while (it.hasNext()) {
            Integer current = it.next();
            if (current % 2 == 0) {
                it.remove();
            }
        }

        System.out.println("Only odd values survived: " + coll);
    }
}
