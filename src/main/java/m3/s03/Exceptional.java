package m3.s03;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Exceptional {
    private static final Logger LOG = Logger.getGlobal();

    public void f() {
        // ...

        // ...
        try {
            g();
        } catch (Exception ex) {
            LOG.log(Level.SEVERE, ex, () -> "Exception caught in f()");
        } finally {
            cleanup();
        }
    }

    public void f2() throws Exception {
        // ...
        g();
    }

    public void g() throws Exception {
        // ...
        if (somethingUnexpected()) {
            throw new Exception();
        }
    }

    private void cleanup() {
        LOG.info("performing cleanup");
    }

    private boolean somethingUnexpected() {
        return true;
    }

    public static void main(String[] args) throws Exception {
        Exceptional exceptional = new Exceptional();

        LOG.info("I'm about to call f(), it won't throw exceptions");
        exceptional.f();

        LOG.info("Calling g() could be dangerous");
        try {
            // exceptional.f2();
            exceptional.g();
        } catch (Exception e) {
            LOG.log(Level.SEVERE, e, () -> "Something went wrong");
        }

        LOG.info("Final call to g(), exception passed on to JVM");
        exceptional.g();

        LOG.info("This statement won't be reached");
    }
}
