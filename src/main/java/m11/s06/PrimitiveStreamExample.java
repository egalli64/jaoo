package m11.s06;

import java.util.Arrays;
import java.util.stream.IntStream;

public class PrimitiveStreamExample {
    public static void main(String[] args) {
        int[] data = {4, 2, 5, 23, 54, 11, 67, 101, 15, 83, 45};
        System.out.println(Arrays.toString(data));

        System.out.println("Looking for a value above 100");
        // IntStream, IntPredicate, OptionalInt, IntConsumer
        Arrays.stream(data).filter(x -> x > 100).findAny() //
                .ifPresentOrElse(x -> System.out.println("Found " + x), () -> System.out.println("Nothing found"));


        // boxing a stream: from IntStream to Stream<Integer>, then "normal" Optional, Predicate and Consumer are used
        Arrays.stream(data).boxed().filter(x -> x > 100).findAny() //
                .ifPresent(x -> System.out.println("Working on boxed integers: " + x));

        // IntStream, IntPredicate, IntConsumer
        System.out.println("Even numbers in [0, 10) ...");
        IntStream.range(0, 10).filter(x -> x % 2 == 0).forEach(System.out::println);

        System.out.println("Even numbers in [0, 10] ...");
        IntStream.rangeClosed(0, 10).filter(x -> x % 2 == 0).forEach(System.out::println);
    }
}
