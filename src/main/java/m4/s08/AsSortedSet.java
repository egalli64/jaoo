package m4.s08;

import java.util.Arrays;
import java.util.Collection;
import java.util.SortedSet;
import java.util.TreeSet;

public class AsSortedSet {
    public static void main(String[] args) {
        Collection<Integer> coll = Arrays.asList(12, 18, -5, -2233);
        SortedSet<Integer> sortedSet = new TreeSet<Integer>(coll);
        System.out.println(coll + " -> " + sortedSet);
        System.out.println("First: " + sortedSet.first());
        System.out.println("Last: " + sortedSet.last());
        System.out.println("Subset [second, last): " + sortedSet.subSet(sortedSet.first() + 1, sortedSet.last()));
    }
}

// [-2233, -5, 12, 18]
// . . . -5 . . .
// -2233 ... 12
//  ... ... ... 18 