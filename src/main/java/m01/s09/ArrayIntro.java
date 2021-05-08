package m01.s09;

import java.util.Arrays;

public class ArrayIntro {
    public static void main(String[] args) {
        // create an array of 12 integers (int)
        int[] values = new int[12];

        // set a value in the first element
        values[0] = 7;

        System.out.print("First element is ");
        System.out.println(values[0]);

        // copy a value from an array in another variable
        int value = values[5];
        System.out.println(value);

        // be careful with indices!
//        value = values[12]; // exception

        // unfortunately this does not work as one would expect
        System.out.println(values);

        // convert an array to a string
        String s = Arrays.toString(values);
        System.out.println(s);

        System.out.println("Done");
    }
}
