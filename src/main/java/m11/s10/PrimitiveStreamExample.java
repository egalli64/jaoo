package m11.s10;

import java.util.Arrays;
import java.util.stream.IntStream;

public class PrimitiveStreamExample {
    public static void main(String[] args) {
        int[] data = {4, 2, 5, 23, 54, 11, 67, 100, 15, 83, 45};
        System.out.println(Arrays.toString(data));

        // IntStream, IntBinaryOperator, OptionalInt, IntConsumer
        Arrays.stream(data).reduce(Integer::sum) //
                .ifPresent(x -> System.out.println("All-primitive sum: " + x));

        // boxing a stream: from IntStream to Stream<Integer>, then "normal" Optional and Consumer are used
        Arrays.stream(data).boxed().reduce(Integer::sum) //
                .ifPresent(x -> System.out.println("Working on boxed integers: " + x));

        // IntStream, IntPredicate, IntConsumer
        System.out.println("Even numbers in [0, 10) ...");
        IntStream.range(0, 10).filter(x -> x % 2 == 0).forEach(System.out::println);

        System.out.println("Even numbers in [0, 10] ...");
        IntStream.rangeClosed(0, 10).filter(x -> x % 2 == 0).forEach(System.out::println);

        String[] names = {"Tom", "Robert", "Jonathan"};
        System.out.println("Names: " + Arrays.toString(names));

        // Stream<String>, ToIntFunction, IntStream, OptionalInt, IntConsumer
        System.out.print("The longest name has length ");
        Arrays.stream(names).mapToInt(String::length).max()
                .ifPresentOrElse(System.out::println, () -> System.out.println("unknown!"));
    }
}
