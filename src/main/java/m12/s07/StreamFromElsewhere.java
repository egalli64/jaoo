package m12.s07;

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
    }
}
