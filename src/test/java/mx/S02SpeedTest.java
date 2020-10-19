package mx;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.closeTo;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class S02SpeedTest {

    @Test
    void speedPlain() {
        double actual = S02.speed(100, 9.58);

        assertThat(actual, closeTo(10.438, 0.001));
    }

    @Test
    void speedInfinity() {
        double actual = S02.speed(100, 0);

        assertThat(actual, is(Double.POSITIVE_INFINITY));
    }

    @Test
    @Disabled
    void speedNegativeTime() {
        try {
            S02.speed(100, -1);
            fail("An ExUncheckedException was expected");
        } catch (ExUncheckedException eue) {
            String message = eue.getMessage();
            assertThat(message, is("No negative values expected"));
        }
    }
}
