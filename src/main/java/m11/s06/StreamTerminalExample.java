package m11.s06;

import static java.util.stream.Collectors.toSet;

import java.util.List;

public class StreamTerminalExample {
    public static void main(String[] args) {
        List<Integer> values = List.of(11, 34, 2, 11, 5, 2);
        System.out.println("Original data: " + values);

        System.out.println("count(): " + values.stream().count());

        System.out.println("forEach() begin");
        values.stream().forEach(System.out::println);
        System.out.println("forEach() end");

        System.out.println("collect(toSet): " + values.stream().collect(toSet()));
    }
}
