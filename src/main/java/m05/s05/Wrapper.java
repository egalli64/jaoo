package m05.s05;

import java.util.Arrays;

public class Wrapper {
    public static void main(String[] args) {
        Object[] wrappers = { Boolean.class, Character.class, Short.class, Integer.class, Float.class, Double.class };
        System.out.println("Wrapper classes: " + Arrays.toString(wrappers));

        // Ctor deprecated from Java 9 on
        @SuppressWarnings("deprecation")
        Integer i = new Integer(1);
        Integer j = Integer.valueOf(2);
        System.out.println(String.format("%d plus %d is %d", i, j, i + j));

        int k = j.intValue();
        System.out.println("k is " + k);

        Integer m = 3;
        System.out.println("m is " + m);

        int n = j;
        System.out.println("n is " + n);
    }
}
