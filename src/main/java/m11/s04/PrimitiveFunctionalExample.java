package m11.s04;

import java.util.function.DoublePredicate;
import java.util.function.DoubleToIntFunction;
import java.util.function.IntConsumer;

public class PrimitiveFunctionalExample {
    public static void main(String[] args) {
        // double -> boolean
        DoublePredicate isPositive = x -> x > 0;
        if (isPositive.test(Math.PI)) {
            System.out.println("The double passed is positive");
        }

        // int -> void
        IntConsumer consume = i -> System.out.println("Consuming this value: " + i);
        consume.accept(42);

        // double -> int
        DoubleToIntFunction intFloor = value -> (int) Math.floor(value);
        System.out.println("The (int) floor of the passed number is " + intFloor.applyAsInt(Math.E));
    }
}
