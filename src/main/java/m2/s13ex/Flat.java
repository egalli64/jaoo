package m2.s13ex;

import java.util.logging.Logger;

public class Flat implements Conditioning {
    private static final Logger LOG = Logger.getGlobal();

    @Override
    public void setTemperature(int newTemp) {
        LOG.info("new temperature is " + newTemp);
    }
}
