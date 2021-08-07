package m09.s03;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> li = new ArrayList<Integer>();
        li.add(4);

        noGenericTypeCheck(li);
        noGenericDowncast();
        noGenericUpcast();
        noGenericArray();
    }

    private static void noGenericTypeCheck(List<Integer> li) {
        // Cannot perform instanceof check against parameterized type
//        if (li instanceof List<Integer>) {
//            System.out.println("As expected");
//        }

        if (li instanceof List<?>) {
            System.out.println("It is a List (of what?)");
        }
    }

    private static void noGenericDowncast() {
        List<Animal> la = new ArrayList<>();
        la.add(new Dog());
        // Cannot cast
//        ArrayList<Dog> ald = (ArrayList<Dog>) la;

        ArrayList<?> alo = (ArrayList<?>) la;
        System.out.println("MyArray contains " + alo.size() + " object(s)");
    }

    private static void noGenericUpcast() {
        List<Dog> ld = new ArrayList<>();
        ld.add(new Dog());
        // Cannot cast
//        ArrayList<Animal> ala = (ArrayList<Animal>) ld;

        ArrayList<?> alo = (ArrayList<?>) ld;
        System.out.println("MyArray contains " + alo.size() + " object(s)");
    }

    private static void noGenericArray() {
        // Cannot create an array of generics
//        List<Dog>[] ld = new ArrayList<Dog>[10];

        // If you really need it
        List<?>[] alo = new ArrayList<?>[10];
        System.out.println("Length of alo is " + alo.length);
        alo[0] = new ArrayList<Dog>();
        alo[1] = new ArrayList<Integer>();

        // Still, using an unbound generic is a pain
        @SuppressWarnings("unchecked")
        ArrayList<Dog> ald = (ArrayList<Dog>) alo[0];
        ald.add(new Dog());
        System.out.println("Size of ald is " + ald.size());
    }
}
