package m11.s12;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.toList;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorExample {
    public static void main(String[] args) {
        List<Integer> data = List.of(4, 2, 5, -23, 54, -11, 67, -100, 15, -83, 45);

        System.out.println("Values: " + data.stream().collect(toList()));

        // counting
        System.out.println("Counting: " + data.stream().collect(counting()));
        System.out.println("Count: " + data.stream().count());

        // max & min
        data.stream().collect(Collectors.maxBy(Comparator.naturalOrder())) //
                .ifPresent(x -> System.out.println("Max by: " + x));
        data.stream().collect(Collectors.minBy(Comparator.naturalOrder())) //
                .ifPresent(x -> System.out.println("Min by: " + x));
        data.stream().max(Comparator.naturalOrder()).ifPresent(x -> System.out.println("Max: " + x));
        data.stream().min(Comparator.naturalOrder()).ifPresent(x -> System.out.println("Min: " + x));

    }
}
