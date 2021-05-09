package mex.s02;

import java.util.logging.Logger;

public class Exercise5 {
    private static final Logger log = Logger.getGlobal();

    /**
     * Score based on distance from (0, 0)
     * <li>less or equals to 1: 10
     * <li>in (1, 5]: 5
     * <li>in (5, 10]: 1
     * <li>more than 10: 0
     *
     * @param x
     * @param y
     *
     * @return resulting points: 0, 1, 5, or 10
     */
    public static int score(double x, double y) {
        log.info(String.format("(%.5f, %.5f)", x, y));

        // TODO
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
