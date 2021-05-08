package m01.s09;

import java.util.Arrays;

public class More {
    public static void main(String[] args) {
        int[] one = { 1, 2, 3, 4, 5 };
        System.out.println(Arrays.toString(one));

        // create a copy of one w/ length increased by 2
        int[] oneExtra = Arrays.copyOf(one, one.length + 2);
        System.out.println(Arrays.toString(oneExtra));

        int[] two = { 6, 2, 4, 5, 3 };
        System.out.println(Arrays.toString(two));
        Arrays.sort(two);
        System.out.println(Arrays.toString(two));

        int[] three = new int[5];
        Arrays.fill(three, 42);
        System.out.println(Arrays.toString(three));

        System.out.print("Comparing arrays: ");
        System.out.println(Arrays.equals(one, new int[] { 1, 2, 3, 4, 5 }));
    }
}
