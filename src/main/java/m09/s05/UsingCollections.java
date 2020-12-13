package m09.s05;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UsingCollections {
    public static void main(String[] args) {
        List<Integer> coll = Arrays.asList(4, 2, 6, 1);

        System.out.println(coll);
        System.out.println("max: " + Collections.max(coll));
        System.out.println("min: " + Collections.min(coll));

        Collections.sort(coll);
        System.out.println(coll);
    }
}
