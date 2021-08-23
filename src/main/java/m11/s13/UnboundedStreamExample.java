package m11.s13;

import static java.util.stream.Collectors.toList;
import java.util.stream.Stream;

public class UnboundedStreamExample {
    public static void main(String[] args) {
        var evenNumbers = Stream.iterate(2, x -> x + 2).limit(5).collect(toList());
        System.out.println("The first five even numbers: " + evenNumbers);

        var randomNumbers = Stream.generate(Math::random).limit(5).collect(toList());
        System.out.println("Five random numbers in [0, 1): " + randomNumbers);
    }
}
