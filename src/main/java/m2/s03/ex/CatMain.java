package m2.s03.ex;

public class CatMain {
    public static void main(String[] args) {
        // ?! use equals() instead
        String x = "blue";
        String y = new String("blue");
        if (x == y) {
            System.out.println("won't see it");
        }

        String[] names = { "Tom", "Bob", "Kit", "Zip", "Kit" };
        String[] colors = { "blue", "green", "yellow", "black", "blue" };

        Cat[] cats = new Cat[names.length];
        for (int i = 0; i < cats.length; i++) {
            cats[i] = new Cat(names[i], colors[i]);
        }

        System.out.println(String.format("Currently there are %d cats in the program", Cat.getCount()));

        for (Cat cat : cats) {
            cat.meow();
        }

        // meow for _all_ Kit
        for (int i = 0; i < cats.length; i++) {
            if (cats[i].getName().equals("Kit")) {
                cats[i].meow();
            }
        }

        // meow for just first Kit
        for (int i = 0; i < cats.length; i++) {
            if (cats[i].getName().equals("Kit")) {
                cats[i].meow();
                break;
            }
        }

        // meow for just last Kit
        for (int i = cats.length - 1; i >= 0; i--) {
            if (cats[i].getName().equals("Kit")) {
                cats[i].meow();
                break;
            }
        }

        // "for-each" all Kit
        for (Cat cat : cats) {
            if (cat.getName().equals("Kit")) {
                cat.meow();
            }
        }

        // only cats in even positions
        for (int i = 0; i < cats.length; i++) {
            if (i % 2 == 0) {
                cats[i].meow();
            }
        }

        // let meow Zip once, and Kit twice
        System.out.println("Zip and Kit");
        for (Cat cat : cats) {
            switch (cat.getName()) {
            case "Zip":
                cat.meow();
                break;
            case "Kit":
                cat.meow(2);
                break;
            default:
                System.out.println("Nothing to do here");
                break;
            }
        }
    }
}
