package m2.s42;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class AsCollection {
    public static void main(String[] args) {
        Collection<Integer> coll = emptyCollection();

        coll.addAll(aCollection());
        System.out.println(coll);

        if (coll.contains(-2233)) {
            System.out.println("-2233 is there");
        }

        if (coll.equals(aCollection())) {
            System.out.println("Same collection");
        }

        coll.add(42);
        if (!coll.equals(aCollection())) {
            System.out.println("Different collection");
        }

        System.out.println("The collection has " + coll.size() + " elements");

        Iterator<Integer> it = coll.iterator();
        System.out.print("{ ");
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println('}');

        coll.remove(-5);

        Integer[] values = coll.toArray(new Integer[coll.size()]);
        System.out.println(Arrays.toString(values));

        coll.retainAll(aCollection());
        System.out.println(coll);

        coll.clear();
        System.out.println("Collection is empty? " + coll.isEmpty());
    }

    private static Collection<Integer> emptyCollection() {
        Collection<Integer> result = new ArrayList<Integer>();

        return result;
    }

    private static Collection<Integer> aCollection() {
        return Arrays.asList(12, 18, -5, -2233);
    }
}
