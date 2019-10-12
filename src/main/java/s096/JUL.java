package s096;

import java.util.Locale;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JUL {
    public static void someLog() {
        Logger log = Logger.getLogger("sample");

        log.finest("finest message");
        log.finer("finer message");
        log.fine("fine message");
        log.config("config message");
        log.info("info message");
        log.warning("warning message");
        log.severe("severe message");
    }

    public static void main(String[] args) {
        Locale.setDefault(new Locale("en", "EN"));
        Logger log = Logger.getLogger("sample");

        someLog();

        ConsoleHandler handler = new ConsoleHandler();
        handler.setLevel(Level.ALL);
        log.setLevel(Level.ALL);
        log.addHandler(handler);
        log.setUseParentHandlers(false);

        someLog();
    }
}
