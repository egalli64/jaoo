package mx;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;

class S03IsLeapTest {
    @Test
    void isLeapTrue() {
        boolean actual = S03.isLeapYear(2020);

        assertThat(actual, is(true));
    }

    @Test
    void isLeapFalse() {
        boolean actual = S03.isLeapYear(1900);

        assertThat(actual, is(false));
    }
}
