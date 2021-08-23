package m11.s09;

import java.util.Arrays;
import java.util.List;
import static java.util.stream.Collectors.toList;

public class StreamMapFlatteningExample {
    public static void main(String[] args) {
        List<Integer> li1 = List.of(4, 45, 49, 18);
        List<Integer> li2 = List.of(14, 5, 9, 81);

        var lists = new List[] { li1, li2 };
        var lix = Arrays.stream(lists).flatMap(List<Integer>::stream).sorted().collect(toList());
        System.out.println("All items, sorted: " + lix);

        class Pair {
            Integer first;
            Integer second;

            public Pair(Integer first, Integer second) {
                this.first = first;
                this.second = second;
            }

            @Override
            public String toString() {
                return "[" + first + ", " + second + "]";
            }
        }

        var cartesian = li1.stream().sorted() //
                .flatMap(i -> li2.stream().sorted().map(j -> new Pair(i, j))) //
                .collect(toList());
        System.out.println("Cartesian product: " + cartesian);
    }
}
