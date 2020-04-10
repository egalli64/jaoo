package m2.s15;

import java.util.Arrays;

public class More {
    public static void main(String[] args) {
        int[] one = { 1, 2, 3, 4, 5 };
        int[] two = { 6, 2, 4, 5, 3 };

        System.out.println(one);
        System.out.println(Arrays.toString(one));

        System.out.println(Arrays.toString(Arrays.copyOf(one, 7)));

        Arrays.sort(two);
        System.out.println(Arrays.toString(two));

        int[] three = new int[5];
        Arrays.fill(three, 42);
        System.out.println(Arrays.toString(three));

        System.out.println(Arrays.equals(one, new int[] { 1, 2, 3, 4, 5 }));
    }
}
