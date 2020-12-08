package m05.s03;

import java.util.logging.Logger;

public class Dog {
    private static final Logger log = Logger.getGlobal();

    private String name;

    public Dog() {
        name = "No name";
        log.info("A new anonymous dog has been created");
    }

    public Dog(String name) {
        // "this" name - the name of the current object -
        // is initialized with the parameter name
        this.name = name;
        log.info("A new dog named " + name + " has been created");
    }

    public void bark() {
        System.out.println(name + ": woof");
    }
}
