package m09.s05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Iterating {
    public static void main(String[] args) {
        List<Integer> aList = Arrays.asList(1, 3, 4, 2);
        Iterable<Integer> iterable = new ArrayList<Integer>(aList);

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

        // Java8 forEach w/ blanks
        iterable.forEach(value -> System.out.print(value + " "));
        System.out.println();
    }
}
