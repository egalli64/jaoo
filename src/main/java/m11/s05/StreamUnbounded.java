package m11.s05;

import static java.util.stream.Collectors.toList;
import java.util.stream.Stream;

public class StreamUnbounded {
    public static void main(String[] args) {
        System.out.println("The first five even numbers");
        Stream.iterate(2, x -> x + 2).limit(5).forEach(System.out::println);

        System.out.println("Odd numbers less than 10");
        Stream.iterate(1, x -> x < 10, x -> x + 2).forEach(System.out::println);

        System.out.println("Five random numbers in [0, 1)");
        Stream.generate(Math::random).limit(5).forEach(System.out::println);
    }
}
