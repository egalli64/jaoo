package m12.s02;

import java.util.Arrays;

public class ComparatorExample {
    public static void main(String[] args) {
        String[] names = { "Tom", "Bo", "Billy", "Tony" };
        System.out.println("As created: " + Arrays.toString(names));

        Arrays.sort(names, (String left, String right) -> left.length() - right.length());
        System.out.println("From shorter to longer: " + Arrays.toString(names));
    }
}
