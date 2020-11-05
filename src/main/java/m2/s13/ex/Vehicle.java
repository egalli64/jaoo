package m2.s13.ex;

import java.util.logging.Logger;

public class Vehicle {
    private static final Logger LOG = Logger.getGlobal();

    public void steer(boolean right) {
        LOG.info("Steering " + (right ? "right" : "left"));
    }

    public void brake() {
        LOG.info("Braking");
    }
}
