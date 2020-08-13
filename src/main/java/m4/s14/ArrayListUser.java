package m4.s14;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListUser {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>(Arrays.asList(23, 12, 18, 5));
        System.out.println("Values in al: " + al);

        ArrayList<Integer> al2 = new ArrayList<Integer>();
        al2.add(56);

        // ...

        Integer value = al2.get(0);
        System.out.println("Value in al2[0]: " + value);
    }
}
