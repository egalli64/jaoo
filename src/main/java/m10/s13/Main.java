package m10.s13;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> data = Arrays.asList(42, 7, 5, 12);
        System.out.println("input: " + data);

        data.sort(new OddFirst());
        System.out.println("ordered, odd first: " + data);

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
    }
}
