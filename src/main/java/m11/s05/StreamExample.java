package m11.s05;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {
        List<Integer> values = List.of(12, 34, 2, 11, 5, 7);
        System.out.println("Starting from this collection:" + values);

        // without stream
        List<Integer> evenClassic = extractEvenValuesNoStream(values);
        System.out.println("Even numbers are: " + evenClassic);

        // with stream
        List<Integer> evenStream = values.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
        System.out.println("Even numbers are: " + evenStream);
    }

    private static List<Integer> extractEvenValuesNoStream(List<Integer> values) {
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
