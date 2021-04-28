package m01.s08;

import java.util.Arrays;

public class StringArrayTwo {
    public static void main(String[] args) {
        String[][] two = { { "ciao", "buongiorno" }, { "hello", "good morning" } };

        System.out.println(two);
        System.out.println(Arrays.toString(two));
        System.out.println(Arrays.deepToString(two));
    }
}
