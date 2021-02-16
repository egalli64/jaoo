package m12.s11;

import java.util.List;

public class ReduceExample {
    public static void main(String[] args) {
        List<Integer> data = List.of(4, 2, 5, 23, 54, 11, 67, 100, 15, 83, 45);
        System.out.println(data);

        Integer sum = data.stream().reduce(0, (x, y) -> x + y);
        System.out.println("The sum is " + sum);

        data.stream().reduce(Integer::sum) //
                .ifPresent(z -> System.out.println("The sum is " + z));

        data.stream().reduce(Integer::max) //
                .ifPresent(z -> System.out.println("The largest value is " + z));

        data.stream().reduce(Integer::min) //
                .ifPresent(z -> System.out.println("The smallest value is " + z));

        // map-reduce example
        data.stream().map(x -> x % 2 == 0 ? 0 : 1).reduce(Integer::sum) //
                .ifPresent(z -> System.out.println("Count of odd numbers: " + z));

        // in this case, using map-reduce is an overkill
        System.out.println("Count of odd numbers: " + //
                data.stream().filter(x -> x % 2 == 1).count());
    }
}
