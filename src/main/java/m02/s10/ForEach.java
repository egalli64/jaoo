package m02.s10;

import java.util.Arrays;

public class ForEach {
    public static void main(String[] args) {
        String[] array = { "one", "two", "three", "four", "five" };
        // ...

        // for-each helps readability
        for (String item : array) {
            System.out.println(item);
        }

        // we really don't care about "i" here
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        // beware of how for-each works on primitives
        int[] ai = { 1, 2, 3, 4, 5 };
        for (int cur : ai) {
            cur += 1;
            System.out.println(cur);
        }
        System.out.println(Arrays.toString(ai));

        // beware of how for-each works on immutable references
        for (String item : array) {
            item += 3;
            System.out.println(item);
        }
        System.out.println(Arrays.toString(array));

        // classic for is what we need in this case
        for (int i = 0; i < array.length; i++) {
            array[i] += i;
            System.out.println(array[i]);
        }
        System.out.println(Arrays.toString(array));
    }
}
