package m09.s20;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TreeUser {
    public static void main(String[] args) {
        List<String> data = List.of("alpha", "beta", "gamma", "delta", "gamma");

        Set<String> ts = new TreeSet<>(data);
        System.out.println("Simple tree: " + ts);

        class MyStringComparator implements Comparator<String> {
            public int compare(String s, String t) {
                return s.compareTo(t);
            }
        }

        MyStringComparator msc = new MyStringComparator();

        Set<String> ts2 = new TreeSet<>(msc);
        ts2.addAll(data);
        System.out.println("A tree initialized with a comparator (same as default): " + ts2);

        Set<String> ts3 = new TreeSet<>(msc.reversed());
        ts3.addAll(data);
        System.out.println("A tree initialized with a reversed comparator: " + ts3);

        Set<String> ts4 = new TreeSet<>((s, t) -> t.compareTo(s));
        ts4.addAll(data);
        System.out.println("A tree initialized with a lambda comparator: " + ts4);
    }
}
