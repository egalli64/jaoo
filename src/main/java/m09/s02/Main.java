package m09.s02;

import java.util.logging.Logger;

public class Main {
    private static final Logger LOG = Logger.getGlobal();

    public static void main(String[] args) {
        Encloser encloser = new Encloser();

        // Error: The type Encloser.InnerPrivate is not visible
//        Encloser.InnerPrivate eipx;

        // however, in some way, we can use an inner private class
        Getter x = encloser.f();
        System.out.println("Accessing a private member of encloser: " + x.getValue());

        // this is safer
        encloser.g();

        LOG.info("creating and using an inner object");
        Encloser.InnerPublic eip = encloser.new InnerPublic();
        System.out.println("Accessing a private member of encloser: " + eip.getDoubledValue());
    }
}
