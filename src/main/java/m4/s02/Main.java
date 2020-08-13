package m4.s02;

import java.util.logging.Logger;

public class Main {
    private static final Logger LOG = Logger.getGlobal();

    public static void main(String[] args) {
        Enclosing enclosing = new Enclosing();
        enclosing.f();
        enclosing.g();

        LOG.info("creating and using an Inner object out of Enclosing");
        Enclosing.InnerPublic eip = enclosing.new InnerPublic();
        eip.fx();

        // Error: The type Enclosing.InnerPrivate is not visible
//        Enclosing.InnerPrivate eipx;
    }
}
