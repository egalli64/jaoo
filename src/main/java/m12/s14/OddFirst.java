package m12.s14;

import java.util.Comparator;

public class OddFirst implements Comparator<Integer> {
    @Override
    public int compare(Integer left, Integer right) {
        if (left % 2 == 1 && right % 2 == 0) {
            return -1;
        }
        if (left % 2 == 0 && right % 2 == 1) {
            return 1;
        }
        return left.compareTo(right);
    }
}