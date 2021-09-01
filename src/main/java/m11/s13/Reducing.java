package m11.s13;

import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Reducing {
    public static void main(String[] args) {
        List<Integer> values = List.of(4, 2, 5, -23, 54, -11, 67, -100, 15, -83, 45);
        System.out.println("Values: " + values);

        System.out.println("Sum by reducing: " +
                values.stream().collect(Collectors.reducing(0, Function.identity(), (i, j) -> i + j)));

        System.out.println("Sum by reduce(): " + values.stream().reduce(0, Integer::sum));
        System.out.println("Sum by reduce() - optional: " + values.stream().reduce(Integer::sum));

        // max & min
        values.stream().collect(Collectors.maxBy(Comparator.naturalOrder()))
                .ifPresent(x -> System.out.println("Max by: " + x));
        values.stream().max(Comparator.naturalOrder())
                .ifPresent(x -> System.out.println("Same, using max(): " + x));
        values.stream().collect(Collectors.minBy(Comparator.naturalOrder()))
                .ifPresent(x -> System.out.println("Min by: " + x));
        values.stream().min(Comparator.naturalOrder())
                .ifPresent(x -> System.out.println("Same, using min(): " + x));
    }
}
