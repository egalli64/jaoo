package m2.s03;

import java.util.logging.Logger;

public class Dog {
    private static final Logger LOG = Logger.getGlobal();

    private String name;

    public Dog() {
        name = "No name";
        LOG.info("A new anonymous dog has been created");
    }

    // not a good parameter name, see "this"
    public Dog(String nm) {
        name = nm;
        LOG.info("A new dog named " + name + " has been created");
    }

    public void bark() {
        System.out.println(name + ": woof");
    }
}
