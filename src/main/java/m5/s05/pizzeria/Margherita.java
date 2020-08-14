package m5.s05.pizzeria;

import java.util.logging.Logger;

public class Margherita extends Pizza {
    private static final Logger LOG = Logger.getGlobal();
    private String extra = "";

    public Margherita() {
        this(false);
    }

    public Margherita(boolean rucola) {
        extra = rucola ? "rucola" : "";
        LOG.info("Margherita " + extra);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " " + extra;
    }
}
