package m4.s22;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class Reflection {
    private static void printIntegerMethods() {
        Class<?> c = Integer.class;
        Method[] methods = c.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }
    }

    private static void printDefaultArrayListCapacity() {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);

        // since Java 9: warning for illegal reflective access
        try {
            Field field = ArrayList.class.getDeclaredField("elementData");
            field.setAccessible(true);
            Object[] data = (Object[]) field.get(al);
            System.out.println("My ArrayList has capacity " + data.length);
        } catch (NoSuchFieldException | SecurityException | IllegalAccessException e) {
            System.out.println("Couldn't get ArrayList capacity: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        printIntegerMethods();
        printDefaultArrayListCapacity();
    }
}
