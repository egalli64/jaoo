package m13.s04;

import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class OptionalExample {
    public static void main(String[] args) {
        // consuming a good optional
        Optional<Double> good = Optional.of(42.5);
        Consumer<Double> doubleConsumer = value -> System.out.println("The good value is " + value);
        good.ifPresent(doubleConsumer);

        // not consuming a bad optional, using a runnable instead
        Optional<String> bad = Optional.empty();
        Consumer<String> stringConsumer = value -> System.out.println("The bad value is " + value);
        Runnable runnable = () -> System.out.println("There's no value in this optional!");
        bad.ifPresentOrElse(stringConsumer, runnable);

        // supplying a value for an empty optional
        Supplier<String> stringSupplier = () -> "There's really no value in this optional!";
        System.out.println(bad.orElseGet(stringSupplier));
    }
}
