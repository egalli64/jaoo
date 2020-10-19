package mx;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;

class S03CheckSignTest {

    @Test
    void checkSignPositive() {
        String actual = S03.checkSign(42);

        assertThat(actual, is("positive"));
    }

    @Test
    void checkSignNegative() {
        String actual = S03.checkSign(-42);

        assertThat(actual, is("negative"));
    }

    @Test
    void checkSignZero() {
        String actual = S03.checkSign(0);

        assertThat(actual, is("zero"));
    }
}
