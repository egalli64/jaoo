package m05.s04;

import java.util.logging.Logger;

public class Dog {
    private static final Logger log = Logger.getGlobal();

    private String name;
    private String breed;

    private Dog(String name) {
        this.name = name;
        this.breed = "Mixed";
        log.info(String.format("A new mixed dog has been created with name [%s]", name));
    }

    public static Dog createWithNoName() {
        /*
         * 1. fetch images for components a: nose b: tail c: ...
         * 
         * 2. goto database for info on dog breed ...
         * 
         * 3. ...
         */

        return new Dog("No name");
    }

    public static Dog createWithName(String name) {
        return new Dog(name);
    }

    public static Dog createWithBreedButNoName(String breed) {
        Dog my = new Dog("No Name");
        my.breed = breed;

        return my;
    }

    public void bark() {
        System.out.println(breed + " " + name + ": woof");
    }
}
