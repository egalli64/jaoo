package m11.s06;

import java.util.ArrayList;
import java.util.List;

public class StreamExample {
    public static void main(String[] args) {
        List<Integer> data = List.of(12, 34, 2, 11, 5, 7);
        System.out.println("Starting from this collection:" + data);

        // without stream
        System.out.println("Even numbers (no stream)");
        extractEvenValues(data).forEach(System.out::println);

        // with stream
        System.out.println("Even numbers (stream)");
        data.stream().filter(x -> x % 2 == 0).forEach(System.out::println);
    }

    private static List<Integer> extractEvenValues(List<Integer> values) {
        List<Integer> result = new ArrayList<>();

        // consumes the input list, adding its even elements to the result
        values.forEach(value -> {
            if (value % 2 == 0) {
                result.add(value);
            }
        });

        return result;
    }
}
