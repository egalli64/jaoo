package m10.s15;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class ArrayListUser {
    public static void main(String[] args) {
        List<Integer> empty = new ArrayList<>();
        recap("An empty list", empty);

        List<Integer> sizedEmpty = new ArrayList<>(5);
        recap("An empty list w/ capacity", sizedEmpty);

        // an unmodifiable list
        var temp = List.of(23, 12, 18, 5, 42, 88);
        // a fixed-sized list backed by an array
//        var temp = Arrays.asList(23, 12, 18, 5);
        ArrayList<Integer> al = new ArrayList<>(temp);
        recap("A list by copy constructor", al);

        al.add(56);
        al.add(1, 18);
        recap("Couple of elements added", al);

        // ...

        Integer value = al.get(0);
        System.out.println("Value at the beginning: " + value);

        al.trimToSize();
        recap("After trimming", al);
    }

    private static void recap(String message, List<?> lst) {
        System.out.println(String.format("%s: %s, current size %d, capacity %d", //
                message, lst, lst.size(), getCapacity(lst)));
    }

    /**
     * A bit of reflection to get the capacity from an ArrayList
     * <p>
     * Disregard the warnings, until you can
     * 
     * @param al the actual ArrayList
     * @return its capacity
     */
    private static int getCapacity(List<?> al) {
        Field field;
        try {
            field = ArrayList.class.getDeclaredField("elementData");
            field.setAccessible(true);
            return ((Object[]) field.get(al)).length;
        } catch (NoSuchFieldException | SecurityException | IllegalAccessException e) {
            throw new IllegalStateException("Can't determine capacity!", e);
        }
    }
}
