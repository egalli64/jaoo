package m3.s03;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Mistake {
    private static final Logger LOG = Logger.getGlobal();

    public static void main(String[] args) {
        int value = Integer.MAX_VALUE;
        LOG.info("value is " + value);

        try {
            System.out.println(increment(value));
        } catch (Exception e) {
            LOG.log(Level.SEVERE, "Can't increase " + value, e);
        }

        // ...

        try {
            value = increment(value);
        } catch (Exception e) {
            LOG.log(Level.SEVERE, "Can't increase " + value, e);
        }

        // ...

        System.out.println("value is " + value);
    }

    /**
     * 
     * @param x
     * @return
     */
    static int increment(int x) throws Exception {
        if (x == Integer.MAX_VALUE) {
            throw new Exception();
        }
        return x + 1;
    }
}
