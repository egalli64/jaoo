package m11.s11;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrimitiveStreamExample {
    public static void main(String[] args) {
        int[] data = { 4, 2, 5, 23, 54, 11, 67, 100, 15, 83, 45 };
        System.out.println(Arrays.toString(data));

        // IntStream, IntBinaryOperator, OptionalInt, IntConsumer
        Arrays.stream(data).reduce(Integer::sum) //
                .ifPresent(x -> System.out.println("No boxing/unboxing to calculate sum: " + x));

        // boxing a stream
        Stream<Integer> si = Arrays.stream(data).boxed();
        si.reduce(Integer::sum) //
                .ifPresent(x -> System.out.println("No boxing/unboxing to calculate sum: " + x));

        System.out.println("Even numbers in [0, 10) ...");
        IntStream.range(0, 10).filter(x -> x % 2 == 0).forEach(System.out::println);

        System.out.println("Even numbers in [0, 10] ...");
        IntStream.rangeClosed(0, 10).filter(x -> x % 2 == 0).forEach(System.out::println);
    }
}
