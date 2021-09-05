package m10.s05;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Looping {
    public static void main(String[] args) {
        Iterable<Integer> iterable = new ArrayList<>(List.of(1, 3, 4, 2, 42));
        System.out.println("Iterable: " + iterable);

        System.out.print("\"while has next\" loop: ");
        Iterator<Integer> it = iterable.iterator();
        while (it.hasNext()) {
            Integer value = it.next();
            System.out.print(value + " ");
            if(value > 10) {
                it.remove();
            }
        }
        System.out.println();
        System.out.println("Iterable after looping and removing: " + iterable);

        System.out.print("for-each loop: ");
        for (Integer value : iterable) {
            System.out.print(value + " ");
        }
        System.out.println();

        System.out.print("Java8 forEach(): ");
        iterable.forEach(value -> System.out.print(value + " "));
        System.out.println();

        System.out.print("Java8 (too) compact forEach(): ");
        iterable.forEach(System.out::print);
        System.out.println();
    }
}
