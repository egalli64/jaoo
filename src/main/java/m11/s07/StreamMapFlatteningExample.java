package m11.s07;

import java.util.List;
import java.util.stream.Stream;

public class StreamMapFlatteningExample {
    public static void main(String[] args) {
        List<Integer> li1 = List.of(4, 45, 49, 18);
        System.out.println("list one: " + li1);

        List<Integer> li2 = List.of(14, 5, 9, 81);
        System.out.println("list two: " + li2);

        System.out.println("All integers (sorted) in the lists");
        Stream.of(li1, li2).flatMap(List<Integer>::stream).sorted().forEach(System.out::println);

        System.out.println("Cartesian product");
        cartesianProduct(li1, li2);

        // strings and nulls
        String[] data = {"Some ", "good ", "strings ", null, "but ", "also ", "some ", null};

        System.out.print("This is not good: ");
        Stream.of(data).forEach(System.out::print);
        System.out.println();

        System.out.print("This is better: ");
        Stream.of(data).flatMap(Stream::ofNullable).forEach(System.out::print);
        System.out.println();
    }

    private static void cartesianProduct(List<Integer> left, List<Integer> right) {
        class Pair {
            final int first;
            final int second;

            public Pair(int first, int second) {
                this.first = first;
                this.second = second;
            }

            @Override
            public String toString() {
                return "[" + first + ", " + second + "]";
            }
        }

        left.stream().sorted().flatMap(i -> right.stream().sorted().map(j -> new Pair(i, j)))
                .forEach(System.out::println);
    }
}
