package m11.s08;

import java.util.List;
import static java.util.stream.Collectors.toList;

import java.util.Comparator;

public class StreamIntermediateExample {
    public static void main(String[] args) {
        List<Integer> values = List.of(1, 3, 2, 1, 5, 2);
        System.out.println("Original data: " + values);

        // fiter
        System.out.println("Count odds: " + values.stream().filter(x -> x % 2 == 1).count());

        // map
        List<String> xs = values.stream().map(n -> "x".repeat(n)).collect(toList());
        System.out.println("Convert to x-strings: " + xs);

        // sorted and limit
        List<Integer> top = values.stream().sorted(Comparator.reverseOrder()).limit(3).collect(toList());
        System.out.println("Top three values" + top);

        // distinct, sorted, limit
        List<Integer> bottom = values.stream().distinct().sorted().limit(3).collect(toList());
        System.out.println("Bottom three values (no duplicates)" + bottom);
    }
}
