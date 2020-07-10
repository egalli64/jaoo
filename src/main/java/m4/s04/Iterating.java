package m4.s04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Iterating {
    public static void main(String[] args) {
        Iterable<Integer> iterable = new ArrayList<>(Arrays.asList(1, 3, 4, 2));

        // "while has next" loop
        Iterator<Integer> it = iterable.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        // for each
        for (Integer value : iterable) {
            System.out.print(value + " ");
        }
        System.out.println();

        // Java8 forEach
        iterable.forEach(System.out::print);
        System.out.println();

        // Java8 forEach /2
        iterable.forEach((value) -> {
            System.out.print(value + " ");
        });
        System.out.println();
    }
}
