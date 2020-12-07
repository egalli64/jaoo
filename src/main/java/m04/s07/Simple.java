package m04.s07;

import java.util.logging.Logger;

public class Simple {
    private static final Logger log = Logger.getLogger(Simple.class.getName());

    public void f() {
        System.out.println("simple");

        log.finest("finest message");
        log.finer("finer message");
        log.fine("fine message");
        log.config("config message");
        log.info("info message");
        log.warning("warning message");
        log.severe("severe message");
    }
}
