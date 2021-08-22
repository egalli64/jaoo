package m11.s12;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {
    public static void main(String[] args) {
        List<Integer> values = new ArrayList<>(List.of(7, 45, 12, 43, 13, 51, 52));

        System.out.println("Values: " + values);

        Iterator<Integer> it = values.iterator();
        while(it.hasNext()) {
            if(it.next() %2 == 0) {
                it.remove();
            }
        }

        System.out.println("After removing even values: " + values);

        System.out.println("Each value following 45 on its own line");
        Iterator<Integer> it2 = values.iterator();
        while(it2.hasNext()) {
            if(it2.next() == 45) {
                it2.forEachRemaining(System.out::println);
            }
        }
    }
}
