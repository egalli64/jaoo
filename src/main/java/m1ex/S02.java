package m1ex;

import java.util.logging.Logger;

public class S02 {
	private static final Logger LOG = Logger.getGlobal();

	/**
	 * Average speed
	 * 
	 * @param distance in meters
	 * @param time     in seconds
	 * @return speed in meters per second
	 */
	public static double speed(double distance, double time) {
		LOG.info(String.format("distance is %.3f and time is %.2f", distance, time));

        // TODO
        return 0;
	}

	/**
	 * Distance between (x0, y0) and (x1, y1)
	 * 
	 * @param x0 first point x
	 * @param y0 first point y
	 * @param x1 second point x
	 * @param y1 second point y
	 * @return distance
	 */
	public static double distance(int x0, int y0, int x1, int y1) {
        LOG.info(String.format("(%d, %d) (%d, %d)", x0, y0, x1, y1));

		// TODO
		return 0;
	}

	/**
	 * Engine capacity
	 * 
	 * @param bore   in mm
	 * @param stroke in mm
	 * @param nr     number of cylinders
	 * @return the engine capacity in cm^3
	 */
	public static double engineCapacity(double bore, double stroke, int nr) {
		// TODO
		return 0;
	}

	/**
	 * Add up all the digits in an integer
	 * 
	 * @param value
	 * @return sum of digits
	 * @throws ExerciseException when value is negative
	 */
	public static int digitSum(int value) throws ExerciseException {
		// TODO
		return 0;
	}

	/**
	 * Score based on distance from (0, 0) [1, 5, 10] -> [10, 5, 1, 0]
	 *
	 * @param x
	 * @param y
	 *
	 * @return
	 */
	public static int score(double x, double y) {
		// TODO
		return 0;
	}
}
