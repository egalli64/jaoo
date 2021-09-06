package m08.s06;

import java.time.Instant;

public class InstantMain {
    public static void main(String[] args) {
        System.out.println("Instant for now(): " + Instant.now());

        System.out.println("An instant passing millis: " + Instant.ofEpochMilli(900_000_000_000L));
        System.out.println("An instant passing seconds: " + Instant.ofEpochSecond(1_000_000_000L));
        System.out.println("An instant passing seconds and nano adjustment: " +
                Instant.ofEpochSecond(1_000_000_000L, 1_000_000_000));

        System.out.println(Instant.now().getEpochSecond());
    }
}
