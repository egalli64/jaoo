package m2.s30;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.hamcrest.CoreMatchers.startsWith;
import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.jupiter.api.Test;

class SimpleTest {
    @Test
    public void checkTrue() {
        boolean condition = true;
        assertTrue(condition);
    }

    @Test
    public void checkNull() {
        String reference = null;
        assertNull(reference);
    }

    @Test
    public void checkEquals() {
        int expected = 42;
        int actual = 42;
        assertEquals(expected, actual);
    }

    @Test
    public void checkEqualsDouble() {
        double expected = .87;
        double actual = .29 * 3;
        assertEquals(expected, actual, .0001);
    }

    @Test
    public void hamTrue() {
        boolean condition = true;
        assertThat(condition, is(true));
    }

    @Test
    public void hamTrue2() {
        boolean condition = true;
        assertThat(condition, is(equalTo(true)));
    }

    @Test
    public void hamTrue3() {
        boolean condition = true;
        assertThat(condition, equalTo(true));
    }

    @Test
    public void hamNull() {
        String reference = null;
        assertThat(reference, is((String) null));
    }

    @Test
    public void hamNull2() {
        String reference = null;
        assertThat(reference, is(nullValue()));
    }

    @Test
    public void hamNull3() {
        String reference = null;
        assertThat(reference, nullValue());
    }

    @Test
    public void hamEquals() {
        int expected = 42;
        int actual = 42;
        assertThat(actual, equalTo(expected));
    }

    @Test
    public void hamEquals2() {
        int expected = 42;
        int actual = 42;
        assertThat(actual, is(expected));
    }

    @Test
    public void hamStart() {
        String prefix = "Tom";
        String actual = "Tom Jones";
        assertThat(actual, startsWith(prefix));
    }

    @Test
    public void hamNot() {
        String prefix = "Bob";
        String actual = "Tom Jones";
        assertThat(actual, not(startsWith(prefix)));
    }
}
