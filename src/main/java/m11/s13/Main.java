package m11.s13;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> data = Arrays.asList(42, 7, 5, 12);
        System.out.println("input: " + data);

        // using external comparator
        data.sort(new OddFirst());
        System.out.println("ordered, odd first: " + data);

        // comparator as lambda
        data.sort((left, right) -> {
            if (left % 2 == 0 && right % 2 == 1) {
                return -1;
            }
            if (left % 2 == 1 && right % 2 == 0) {
                return 1;
            }
            return left.compareTo(right);
        });
        System.out.println("ordered, even first: " + data);

        // (ab)using ternary operator to squeeze the code
        Comparator<Integer> c = (left, right) -> left % 2 == 1 && right % 2 == 0 ? -1 : //
                left % 2 == 0 && right % 2 == 1 ? 1 : left.compareTo(right);
        data.sort(c);
        System.out.println("ordered, odd first: " + data);
    }
}
