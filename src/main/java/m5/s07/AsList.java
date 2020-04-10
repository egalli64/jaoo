package m5.s07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AsList {
    public static void main(String[] args) {
        List<Integer> list = aList();
        System.out.println(list);

        System.out.println("At index 2: " + list.get(2));
        list.add(2, -997);
        System.out.println("Index of -997: " + list.indexOf(-997));

        list.remove(3);
        list.set(3, 42);
        System.out.println(list);
    }

    private static List<Integer> aList() {
        return new ArrayList<Integer>(Arrays.asList(12, 18, -5, -2233));
    }
}
