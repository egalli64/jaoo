package m1.s30;

import java.util.logging.Logger;

public class Other {
    private static final Logger LOG = Logger.getLogger(Other.class.getName());

    public void f() {
        System.out.println("other");

        LOG.finest("finest message");
        LOG.finer("finer message");
        LOG.fine("fine message");
        LOG.config("config message");
        LOG.info("info message");
        LOG.warning("warning message");
        LOG.severe("severe message");
    }
}
