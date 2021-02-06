package m11.s09;

import java.util.List;
import static java.util.stream.Collectors.toList;

import java.util.Comparator;

public class StreamIntermediateExample {
    public static void main(String[] args) {
        List<Integer> values = List.of(1, 3, 2, 1, 5, 2);
        System.out.println("Original data: " + values);

        // fiter
        System.out.println("Count odds: " + values.stream().filter(x -> x % 2 == 1).count());

        // sorted and limit
        List<Integer> topValues = values.stream().sorted(Comparator.reverseOrder()).limit(3).collect(toList());
        System.out.println("Top three values" + topValues);

        // distinct, sorted, limit
        List<Integer> bottomValues = values.stream().distinct().sorted().limit(3).collect(toList());
        System.out.println("Bottom three values (no duplicates) " + bottomValues);

        // distinct, sorted, skip
        List<Integer> others = values.stream().distinct().sorted().skip(3).collect(toList());
        System.out.println("Values after first three ones (no duplicates) " + others);
    }
}
