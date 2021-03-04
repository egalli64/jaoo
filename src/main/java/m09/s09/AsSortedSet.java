package m09.s09;

import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class AsSortedSet {
    public static void main(String[] args) {
        Set<Integer> set = Set.of(12, 18, -5, -2233);
        System.out.println("Set: " + set);

        List<Integer> list = List.of(12, 18, -5, -2233, 12, 18);
        System.out.println("List: " + list);
        System.out.println("From list to set: " + Set.copyOf(list));

        SortedSet<Integer> sortedSet = new TreeSet<>(set);
        System.out.println(set + " sorted -> " + sortedSet);
        System.out.println("First: " + sortedSet.first());
        System.out.println("Last: " + sortedSet.last());

        System.out.println("Subset [second, last): " + sortedSet.subSet(sortedSet.first() + 1, sortedSet.last()));
    }
}
