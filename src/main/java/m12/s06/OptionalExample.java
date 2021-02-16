package m12.s06;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        create();
        checkExtract(Optional.of(42.5), Optional.empty());
        conditionalExectution(Optional.of(42.5), Optional.empty());
    }

    private static void create() {
        Optional<String> optHello = Optional.of("Hello");
        System.out.println("An optional of a string: " + optHello);
        try {
            Optional<String> error = Optional.of(null);
            System.out.println(error);
        } catch (NullPointerException npe) {
            System.out.println("Can't make an Optional of null: " + npe);
        }

        String s1 = null;
        String s2 = "Something";

        Optional<String> o1 = Optional.ofNullable(s1);
        System.out.println("An optional of a nullable string: " + o1);
        Optional<String> o2 = Optional.ofNullable(s2);
        System.out.println("An optional of another nullable string: " + o2);

        Optional<String> oEmpty = Optional.empty();
        System.out.println("An empty optional string: " + oEmpty);
    }

    private static void checkExtract(Optional<Double> good, Optional<String> bad) {
        if (good.isPresent()) {
            System.out.println("Optional is present in " + good);

            // since good is present, I can extract its reference
            Double value = good.get();
            System.out.println("The good value is " + value);
        }
        if (bad.isEmpty()) {
            System.out.println("This optional is empty: " + bad);

            // since bad is empty, I get a default value
            String value = bad.orElse("A default value");
            System.out.println("What I get for bad is " + value);
        }
    }

    private static void conditionalExectution(Optional<Double> good, Optional<String> bad) {
        good.ifPresent(value -> System.out.println("The good value is " + value));

        bad.ifPresentOrElse(value -> System.out.println("The bad value is " + value),
                () -> System.out.println("There's no value in this optional!"));
    }
}
