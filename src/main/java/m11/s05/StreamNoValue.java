package m11.s05;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamNoValue {
    public static void main(String[] args) {
        System.out.println("Count for an empty stream: " + Stream.empty().count());

        System.out.println("Count for stream of a nullable actually null: " + Stream.ofNullable(null).count());
    }
}
