package m09.s07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class AsCollection {
    public static void main(String[] args) {
        Collection<Integer> collOne = new ArrayList<Integer>();
        Collection<Integer> collTwo = Arrays.asList(12, 18, -5, -2233);

        collOne.addAll(collTwo);
        // implicit call to the overridden toString() for the actual collOne type
        System.out.println(collOne);

        if (collOne.contains(-2233)) {
            System.out.println("-2233 is there");
        }

        if (collOne.equals(collTwo)) {
            System.out.println("These collections contain the same (equals) elements");
        }

        collOne.add(42);
        if (!collOne.equals(collTwo)) {
            System.out.println("Collections with different elements within");
        }

        System.out.print("This collection has " + collOne.size() + " elements: ");
        Iterator<Integer> it = collOne.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        collOne.remove(-5);

        System.out.print("Converting a collection to an array: ");
        Integer[] values = collOne.toArray(new Integer[collOne.size()]);
        System.out.println(Arrays.toString(values));

        collOne.clear();
        System.out.println("Collection is empty? " + collOne.isEmpty());
    }
}
