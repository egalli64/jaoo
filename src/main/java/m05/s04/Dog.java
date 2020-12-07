package m05.s04;

import java.util.logging.Logger;

public class Dog {
    private static final Logger LOG = Logger.getGlobal();

    private String name;

    // bad parameter name, see "this"
    private Dog(String n) {
        name = n;
        LOG.info(String.format("A new dog has been created with name [%s]", name));
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
