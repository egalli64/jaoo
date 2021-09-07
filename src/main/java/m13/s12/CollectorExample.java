package m13.s12;

import java.util.List;
import java.util.stream.Collectors;

public class CollectorExample {
    public static void main(String[] args) {
        List<Integer> values = List.of(4, 2, 5, -23, 54, -11, 67, -100, 15, -83, 45);
        System.out.println("Values: " + values);

        // toList()
        System.out.println("Positive values: " +
                values.stream().filter(x -> x > 0).collect(Collectors.toList()));

        // counting()
        System.out.println("Counting positive values: " +
                values.stream().filter(x -> x > 0).collect(Collectors.counting()));
        System.out.println("Same, using count(): " + values.stream().filter(x -> x > 0).count());
    }
}
