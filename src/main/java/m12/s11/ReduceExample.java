package m12.s11;

import java.util.List;

public class ReduceExample {
    public static void main(String[] args) {
        List<Integer> data = List.of(4, 2, 5, 23, 54, 11, 67, 100, 15, 83, 45);
        System.out.println(data);

        Integer sum = data.stream().reduce(0, (x, y) -> x + y);
        System.out.println("Adding up elements explicitly: " + sum);

        data.stream().reduce(Integer::sum) //
                .ifPresent(z -> System.out.println("Adding up elements by sum: " + z));

        data.stream().reduce(Integer::max) //
                .ifPresent(z -> System.out.println("Largest value by max: " + z));

        data.stream().reduce(Integer::min) //
                .ifPresent(z -> System.out.println("Smallest value by min: " + z));

        // map-reduce example
        data.stream().map(x -> x % 2 == 0 ? 0 : 1).reduce(Integer::sum) //
                .ifPresent(z -> System.out.println("Count of odd numbers by map-reduce: " + z));

        // in this last case, using map-reduce is an overkill
        System.out.println("Count of odd numbers by count: " + //
                data.stream().filter(x -> x % 2 == 1).count());
    }
}
