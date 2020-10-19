package mx;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.closeTo;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;

class S02DistanceTest {
    @Test
    void distanceSquareTwo() {
        double actual = S02.distance(1, 10, 2, 9);

        assertThat(actual, closeTo(Math.sqrt(2), 0.000_001));
    }

    @Test
    void distanceZero() {
        double actual = S02.distance(27, 42, 27, 42);

        assertThat(actual, is(0.0));
    }
}
