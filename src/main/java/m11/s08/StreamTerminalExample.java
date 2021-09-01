package m11.s08;

import java.util.List;

public class StreamTerminalExample {
    public static void main(String[] args) {
        List<Integer> values = List.of(11, 34, 2, 11, 5, 2);
        System.out.println("Original data: " + values);

        System.out.println("Even values");
        values.stream().filter(x -> x % 2 == 0).forEach(System.out::println);

        System.out.println("Count even values: " + values.stream().filter(x -> x % 2 == 0).count());
    }
}
