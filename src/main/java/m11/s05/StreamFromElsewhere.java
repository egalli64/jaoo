package m11.s05;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFromElsewhere {
    public static void main(String[] args) {
        Integer[] values = { 12, 34, 2, 11, 5, 7 };
        System.out.println("Starting from this array:" + Arrays.toString(values));

        List<Integer> results = Arrays.stream(values).filter(x -> x % 2 == 0).collect(Collectors.toList());
        System.out.println("Even numbers are: " + results);

        results = Stream.of(12, 34, 2, 11, 5, 7).filter(x -> x % 2 == 1).collect(Collectors.toList());
        System.out.println("Odd numbers are: " + results);

        Stream.Builder<Integer> builder = Stream.builder();
        results = builder.add(42).add(2).build().filter(x -> x < 10).collect(Collectors.toList());
        System.out.println("Small numbers are: " + results);

        int[] data = { 12, 34, 2, 11, 5, 7 };
        System.out.println("Starting from this array:" + Arrays.toString(data));

        System.out.print("Max value (classic) is ");
        try {
            System.out.println(max(data));
        } catch (IllegalArgumentException iae) {
            System.out.println("not present");
        }

        System.out.print("Max value (stream) is ");
        Arrays.stream(data).max().ifPresentOrElse(System.out::println, () -> System.out.println("not present"));
    }

    private static int max(int[] values) {
        if(values == null || values.length == 0) {
            throw new IllegalArgumentException("Please, provide at least a value in the input array");
        }

        int result = Integer.MIN_VALUE;
        for(int value: values) {
            if(value > result) {
                result = value;
            }
        }

        return result;
    }
}
