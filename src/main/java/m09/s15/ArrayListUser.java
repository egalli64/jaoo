package m09.s15;

import java.util.ArrayList;
import java.util.List;

public class ArrayListUser {
    public static void main(String[] args) {
        var temp = List.of(23, 12, 18, 5);
//        var temp = Arrays.asList(23, 12, 18, 5);
        ArrayList<Integer> al = new ArrayList<>(temp);
        System.out.println("Values in al: " + al);

        ArrayList<Integer> al2 = new ArrayList<>();
        al2.add(56);
        al2.add(1, 18);

        // ...

        Integer value = al2.get(0);
        System.out.println("Value in al2[0]: " + value);
    }
}
