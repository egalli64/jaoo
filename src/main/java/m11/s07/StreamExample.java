package m11.s07;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {
        List<Integer> values = List.of(12, 34, 2, 11, 5, 7);
        System.out.println("Starting from this collection:" + values);

        // without stream
        List<Integer> evenValues = extractEvenValuesNoStream(values);
        System.out.println("Even numbers are: " + evenValues);

        // with stream
        evenValues = values.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
        System.out.println("Even numbers are: " + evenValues);
    }

    private static List<Integer> extractEvenValuesNoStream(List<Integer> values) {
        List<Integer> result = new ArrayList<Integer>();

        values.forEach(value -> {
            if (value % 2 == 0) {
                result.add(value);
            }
        });

        return result;
    }
}
