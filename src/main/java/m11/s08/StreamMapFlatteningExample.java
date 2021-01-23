package m11.s08;

import java.util.Arrays;
import java.util.List;

public class StreamMapFlatteningExample {
    public static void main(String[] args) {
        List<Integer> li1 = List.of(4, 45, 49, 18);
        List<Integer> li2 = List.of(14, 5, 9, 81);

        // all the items, sorted, in the two lists
        var lists = new List[] { li1, li2 };
        Arrays.stream(lists).flatMap(List<Integer>::stream).sorted().forEach(System.out::println);

        // cartesian product
        li1.stream().sorted().flatMap(i -> li2.stream().sorted().map(j -> new Integer[] { i, j })) //
                .forEach(x -> System.out.println(Arrays.toString(x)));
    }
}
