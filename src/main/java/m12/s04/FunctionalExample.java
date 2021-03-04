package m12.s04;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class FunctionalExample {
    public static void main(String[] args) {
        // void -> void
        Runnable execute = () -> System.out.println("Hello Runnable");
        execute.run();

        // T -> boolean
        Predicate<String> isEvenSized = s -> s.length() % 2 == 0;
        if (isEvenSized.test("hello!")) {
            System.out.println("Hello Predicate");
        }

        // T -> void
        Consumer<String> consume = s -> System.out.println(s);
        consume.accept("Hello Consumer");

        // void -> T
        Supplier<String> greeter = () -> "Hi";
        System.out.println("Greeting supplier: " + greeter.get());

        // T, R -> T
        Function<String, Integer> size = String::length;
        System.out.println("Size of string passed to Function is " + size.apply("Hello Function"));

        // T, U -> R
        BiFunction<String, Integer, String> multi = String::repeat;
        System.out.println("BiFunction: " + multi.apply("Function", 2));

        // T -> T
        UnaryOperator<Boolean> not = x -> !x;
        System.out.println("Unary Operator NOT on true: " + not.apply(true));

        // T, T -> T
        BinaryOperator<Boolean> and = Boolean::logicalAnd;
        System.out.println("Binary Operator AND on true and false: " + and.apply(true, false));
    }
}
