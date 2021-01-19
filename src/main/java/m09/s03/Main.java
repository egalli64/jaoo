package m09.s03;

public class Main {
    public static void main(String[] args) {
        // see test for more stuff
        MyArray<String> mas = new MyArray<>();

        mas.add("hello generic array");
        System.out.println(mas.get(0));

        noGenericTypeCheck(mas);
        noGenericDowncast();
        noGenericUpcast();
        noGenericArray();
    }

    private static void noGenericTypeCheck(MyArray<String> mas) {
        // Cannot perform instanceof check against parameterized type
//      if (mas instanceof MyArray<String>) {
//          System.out.println("As expected");
//      }

        if (mas instanceof MyArray<?>) {
            System.out.println("It is a MyArray (of what?)");
        }
    }

    private static void noGenericDowncast() {
        MyArray<Animal> maa = new MyArray<>();
        maa.add(new Dog());
        // Cannot cast
//        MyArray<Dog> mad = (MyArray<Dog>) maa;

        MyArray<?> mao = (MyArray<?>) maa;
        System.out.println("MyArray contains " + mao.getSize() + " object(s)");
    }

    private static void noGenericUpcast() {
        MyArray<Dog> mad = new MyArray<>();
        mad.add(new Dog());
        // Cannot cast
//        MyArray<Animal> maa = (MyArray<Animal>) mad;

        MyArray<?> mao = (MyArray<?>) mad;
        System.out.println("MyArray contains " + mao.getSize() + " object(s)");
    }

    private static void noGenericArray() {
        // Cannot create a generic array
        // MyArray<Dog>[] mads = new MyArray<Dog>[10];

        // If you really need it
        MyArray<?>[] mao = new MyArray<?>[10];
        mao[0] = new MyArray<Dog>();
        mao[1] = new MyArray<Integer>();

        // Still, using an unbound generic is a pain
        @SuppressWarnings("unchecked")
        MyArray<Dog> mad = (MyArray<Dog>) mao[0];
        mad.add(new Dog());
    }
}
