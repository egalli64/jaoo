package m11.s08;

import java.util.Arrays;
import java.util.List;

public class StreamTerminalPrimitive {
    public static void main(String[] args) {
        int[] values = {11, 34, 2, 11, 5, 2};
        System.out.println("Original data: " + Arrays.toString(values));

        System.out.println("Even values");
        Arrays.stream(values).filter(x -> x % 2 == 0).forEach(System.out::println);

        System.out.println("Count even values: " + Arrays.stream(values).filter(x -> x % 2 == 0).count());
    }
}
