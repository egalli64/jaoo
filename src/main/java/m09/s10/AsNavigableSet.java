package m09.s10;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class AsNavigableSet {
    public static void main(String[] args) {
        Collection<Integer> coll = Arrays.asList(5, -3, -1, 12, 27, 5);
        NavigableSet<Integer> ns = new TreeSet<Integer>(coll);
        System.out.println(coll + " -> " + ns);

        System.out.println("Eleven or more: " + ns.ceiling(11));
        System.out.println("Zero or less: " + ns.floor(0));

        System.out.println("More than -1: " + ns.higher(-1));
        System.out.println("Less than -1: " + ns.lower(-1));

        System.out.println("Poll the first element: " + ns.pollFirst());
        System.out.println("Poll the last element: " + ns.pollLast());

        System.out.print("Looping in descending order: ");
        Iterator<Integer> it = ns.descendingIterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        System.out.println("The set in descending order: " + ns.descendingSet());
    }
}
