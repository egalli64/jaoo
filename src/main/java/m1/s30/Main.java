package m1.s30;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

import m1.s29.Simple;

public class Main {
    private static final Logger LOG;

    static {
        try {
            LogManager.getLogManager()
                    .readConfiguration(Main.class.getClassLoader().getResourceAsStream("s30/logging.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            LOG = Logger.getLogger(Main.class.getName());
        }
    }

    public static void main(String[] args) {
        System.out.println("main");
        LOG.finest("finest message");
        LOG.finer("finer message");
        LOG.fine("fine message");
        LOG.config("config message");
        LOG.info("info message");
        LOG.warning("warning message");
        LOG.severe("severe message");

        Other other = new Other();
        other.f();

        Simple simple = new Simple();
        simple.f();

        System.out.println("Some risky code");
        try {
            int x = 7 / 0;
            System.out.println("x = " + x);
        } catch (Exception ex) {
            LOG.log(Level.SEVERE, "Can't divide an integer by zero", ex);
        }

    }
}
