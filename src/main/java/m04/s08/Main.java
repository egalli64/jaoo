package m04.s08;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

import m04.s07.Simple;

public class Main {
    private static final Logger log;

    static {
        var stream = Main.class.getClassLoader().getResourceAsStream("m04/s08/logging.properties");
        if (stream == null) {
            throw new IllegalStateException("Can't get logging properties");
        }

        try {
            LogManager.getLogManager().readConfiguration(stream);
            log = Logger.getLogger(Main.class.getName());
        } catch (SecurityException | IOException e) {
            e.printStackTrace();
            throw new IllegalStateException("Can't configure logger", e);
        }
    }

    public static void main(String[] args) {
        System.out.println("main");
        log.finest("finest message");
        log.finer("finer message");
        log.fine("fine message");
        log.config("config message");
        log.info("info message");
        log.warning("warning message");
        log.severe("severe message");

        Other other = new Other();
        other.f();

        Simple simple = new Simple();
        simple.f();

        System.out.println("Some risky code");
        try {
            int x = 7 / 0;
            System.out.println("x = " + x);
        } catch (Exception ex) {
            log.log(Level.SEVERE, "Can't divide an integer by zero", ex);
        }
    }
}
