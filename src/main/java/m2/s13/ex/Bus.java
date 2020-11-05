package m2.s13.ex;

import java.util.logging.Logger;

public class Bus extends Vehicle implements Conditioning {
    private static final Logger LOG = Logger.getGlobal();

    @Override
    public void setTemperature(int newTemp) {
        LOG.info("new temperature is " + newTemp);
    }

    @Override
    public void brake() {
        LOG.info("Powerful braking");
    }
}
