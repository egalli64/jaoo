package m4.s02;

import java.util.logging.Logger;

public class Enclosing {
    private static final Logger LOG = Logger.getGlobal();
    private int value = 12;

    public void f() {
        LOG.info("creating and using an InnerPublic object from an Enclosing object");
        InnerPublic inner = new InnerPublic();
        inner.fx();
    }

    public void g() {
        LOG.info("creating and using an InnerPrivate object from an Enclosing object");
        InnerPrivate inner = new InnerPrivate();
        inner.fx2();
    }

    public class InnerPublic {
        public void fx() {
            LOG.info("accessing Enclosing private property: " + value);
        }
    }

    private class InnerPrivate {
        public void fx2() {
            LOG.info("accessing Enclosing private property: " + (value * 2));
        }
    }
}
