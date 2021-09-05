package m12.s02;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorExample {
    public static void main(String[] args) {
        String[] names = { "Tom", "Bo", "Billy", "Tony" };
        System.out.println("As created: " + Arrays.toString(names));

        Comparator<String> naturalOrder = (String left, String right) -> left.length() - right.length();
        Arrays.sort(names, naturalOrder);
        System.out.println("Sorted from shorter to longer: " + Arrays.toString(names));
    }
}
