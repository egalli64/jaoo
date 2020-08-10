package m2.s04;

public class Dog {
    String name;

    // not a good parameter name, see "this"
    public void setName(String nm) {
        if (nm == null || nm.isBlank()) {
            // ...
        } else {
            name = nm;
        }
    }

    // not a good parameter name, see "this"
    private Dog(String nm) {
        name = nm;
    }

    public static Dog createWithNoName() {
        /*
         * 1. fetch images for components a: nose b: tail c: ... 2. goto database for
         * info on dog breed ...
         */

        return new Dog("No name");
    }

    public static Dog createWithName(String name) {
        return new Dog(name);
    }

    public void bark() {
        System.out.println(name + ": woof");
    }
}
