package m05.s03;

import java.util.logging.Logger;

public class Dog {
    private static final Logger log = Logger.getGlobal();

    private String name;

    public Dog() {
        name = "No name";
        log.info("A new anonymous dog has been created");
    }

    // bad parameter name, see "this"
    public Dog(String n) {
        name = n;
        log.info("A new dog named " + name + " has been created");
    }

    public void bark() {
        System.out.println(name + ": woof");
    }
}
