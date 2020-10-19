package mx;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;

class S02DigitSumTest {
    @Test
    void digitSumPositive() {
        int actual = S02.digitSum(123);
        assertThat(actual, is(6));
    }

    @Test
    void digitSumZero() {
        int actual = S02.digitSum(0);
        assertThat(actual, is(0));
    }

    @Test
    void digitSumNegative() {
        int actual = S02.digitSum(-123);
        assertThat(actual, is(6));
    }
}
