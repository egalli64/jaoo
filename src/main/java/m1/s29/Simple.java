package m1.s29;

import java.util.logging.Logger;

public class Simple {
    private static final Logger LOG = Logger.getLogger(Simple.class.getName());

    public void f() {
        System.out.println("simple");

        LOG.finest("finest message");
        LOG.finer("finer message");
        LOG.fine("fine message");
        LOG.config("config message");
        LOG.info("info message");
        LOG.warning("warning message");
        LOG.severe("severe message");
    }
}
