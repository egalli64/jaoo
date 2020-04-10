package m3.s22;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

class SimpleTest {
    @Test
    void negateException() {
        Simple simple = new Simple();

        try {
            simple.negate(0);
            fail("An IllegalArgumentException was expected");
        } catch (IllegalArgumentException iae) {
            String message = iae.getMessage();
            assertThat(message, is("Can't negate 0"));
            return;
        }
    }
}
