package m11.s02;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorExample {
    public static void main(String[] args) {
        String[] names = { "Tom", "Bo", "Billy", "Tony" };
        System.out.println("As created: " + Arrays.toString(names));

        Arrays.sort(names, (String left, String right) -> left.length() - right.length());
        System.out.println("From shorter to longer: " + Arrays.toString(names));

        // a few methods are available to make the job even simpler
        Arrays.sort(names, Comparator.comparingInt(String::length).reversed());
        System.out.println("From longer to shorter: " + Arrays.toString(names));
    }
}
