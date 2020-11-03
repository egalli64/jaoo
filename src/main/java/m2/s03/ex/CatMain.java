package m2.s03.ex;

public class CatMain {
    public static void main(String[] args) {
        String[] names = { "Tom", "Bob", "Kit", "Zip", "Kit" };
        String[] colors = { "blue", "green", "yellow", "black", "yellow" };

        Cat[] cats = new Cat[names.length];
        for (int i = 0; i < cats.length; i++) {
            cats[i] = new Cat(names[i], colors[i]);
        }

        for (Cat cat : cats) {
            cat.meow();
        }

        // meow for Kit
        System.out.println("Cat 2 is: " + cats[0].getName());

        for (Cat cat : cats) {
            cat.meow();
        }
    }
}
