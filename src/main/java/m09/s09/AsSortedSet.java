package m09.s09;

import java.util.Collection;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class AsSortedSet {
    public static void main(String[] args) {
        Collection<Integer> coll = List.of(12, 18, -5, -2233);
        SortedSet<Integer> sortedSet = new TreeSet<Integer>(coll);
        System.out.println(coll + " -> " + sortedSet);
        System.out.println("First: " + sortedSet.first());
        System.out.println("Last: " + sortedSet.last());
        System.out.println("Subset [second, last): " + sortedSet.subSet(sortedSet.first() + 1, sortedSet.last()));
    }
}

// [-2233, -5, 12, 18]
// . . . -5 . . .
// -2233 ... 18
//  ... ... 12 20
