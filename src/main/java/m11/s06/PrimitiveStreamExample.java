package m11.s06;

import java.util.Arrays;
import java.util.stream.IntStream;

public class PrimitiveStreamExample {
    public static void main(String[] args) {
        int[] data = {4, 2, 5, 23, 154, 11, 67, 101, 15, 83, 45};
        System.out.println(Arrays.toString(data));

        System.out.println("Values above 100");
        // IntStream, IntPredicate, IntConsumer
        Arrays.stream(data).filter(x -> x > 100).forEach(System.out::println);

        // boxing a stream: from IntStream to Stream<Integer>, then "normal" Predicate and Consumer are used
        Arrays.stream(data).boxed().filter(x -> x > 100).forEach(System.out::println);

        // IntStream, IntPredicate, IntConsumer
        System.out.println("Even numbers in [0, 10) ...");
        IntStream.range(0, 10).filter(x -> x % 2 == 0).forEach(System.out::println);

        System.out.println("Even numbers in [0, 10] ...");
        IntStream.rangeClosed(0, 10).filter(x -> x % 2 == 0).forEach(System.out::println);
    }
}
