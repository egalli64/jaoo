package m6.s13;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> data = Arrays.asList(42, 7, 5, 12);
        System.out.println("input: " + data);

        data.sort(new OddFirst());
        System.out.println("ordered, odd first: " + data);

        data.sort((lhs, rhs) -> {
            if (lhs % 2 == 0 && rhs % 2 == 1) {
                return -1;
            }
            if (lhs % 2 == 1 && rhs % 2 == 0) {
                return 1;
            }
            return lhs.compareTo(rhs);
        });
        System.out.println("ordered, even first: " + data);
    }
}

class OddFirst implements Comparator<Integer> {
    @Override
    public int compare(Integer lhs, Integer rhs) {
        if (lhs % 2 == 1 && rhs % 2 == 0) {
            return -1;
        }
        if (lhs % 2 == 0 && rhs % 2 == 1) {
            return 1;
        }
        return lhs.compareTo(rhs);
    }
}