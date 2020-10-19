package mx;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;

class S03IsOddTest {
    @Test
    void isOddTrue() {
        boolean actual = S03.isOdd(19);

        assertThat(actual, is(true));
    }

    @Test
    void isOddFalse() {
        boolean actual = S03.isOdd(-12);

        assertThat(actual, is(false));
    }
}
