package m11.s05;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamNoValue {
    public static void main(String[] args) {
        System.out.println("Empty stream: " + Stream.empty().collect(Collectors.toList()));

        System.out.println("Stream from a null: " + Stream.ofNullable(null).collect(Collectors.toList()));
    }
}
