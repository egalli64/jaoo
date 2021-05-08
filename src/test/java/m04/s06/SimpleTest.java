package m04.s06;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.hamcrest.Matchers.closeTo;
import static org.hamcrest.CoreMatchers.startsWith;
import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.jupiter.api.Test;

class SimpleTest {
    @Test
    void checkTrue() {
        boolean condition = true;
        assertTrue(condition);
    }

    @Test
    void checkNull() {
        String reference = null;
        assertNull(reference);
    }

    @Test
    void checkEquals() {
        int expected = 42;
        int actual = 42;
        assertEquals(expected, actual);
    }

    @Test
    void checkEqualsDouble() {
        double expected = .87;
        double actual = .29 * 3;
        assertEquals(expected, actual, .0001);
    }

    @Test
    void hamTrue() {
        boolean actual = true;
        assertThat(actual, is(true));
    }

    @Test
    void hamTrue2() {
        boolean actual = true;
        assertThat(actual, is(equalTo(true)));
    }

    @Test
    void hamTrue3() {
        boolean actual = true;
        assertThat(actual, equalTo(true));
    }

    @Test
    void hamNull() {
        String actual = null;
        assertThat(actual, is((String) null));
    }

    @Test
    void hamNull2() {
        String actual = null;
        assertThat(actual, is(nullValue()));
    }

    @Test
    void hamNull3() {
        String actual = null;
        assertThat(actual, nullValue());
    }

    @Test
    void hamEquals() {
        int expected = 42;
        int actual = 42;
        assertThat(actual, equalTo(expected));
    }

    @Test
    void hamEquals2() {
        int expected = 42;
        int actual = 42;
        assertThat(actual, is(expected));
    }

    @Test
    void hamEqualsDouble() {
        double expected = .87;
        double actual = .29 * 3;
        assertThat(actual, closeTo(expected, .0001));
    }

    @Test
    void hamStart() {
        String prefix = "Tom";
        String actual = "Tom Jones";
        assertThat(actual, startsWith(prefix));
    }

    @Test
    void hamNot() {
        String prefix = "Bob";
        String actual = "Tom Jones";
        assertThat(actual, not(startsWith(prefix)));
    }
}
