package m04.s06;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.withPrecision;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
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
    void ajTrue() {
        boolean actual = true;
        assertThat(actual).isTrue();
    }

    @Test
    void ajEqTrue() {
        boolean actual = true;
        assertThat(actual).isEqualTo(true);
    }

    @Test
    void ajNull() {
        String actual = null;
        assertThat(actual).isNull();
    }

    @Test
    void ajEqNull() {
        String actual = null;
        assertThat(actual).isEqualTo(null);
    }

    @Test
    void ajEquals() {
        int expected = 42;
        int actual = 42;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void ajEqualsDouble() {
        double expected = .87;
        double actual = .29 * 3;
        assertThat(actual).isEqualTo(expected, withPrecision(4d));
    }

    @Test
    void ajStart() {
        String prefix = "Tom";
        String actual = "Tom Jones";
        assertThat(actual).startsWith(prefix);
    }

    @Test
    void ajNotStart() {
        String prefix = "Bob";
        String actual = "Tom Jones";
        assertThat(actual).doesNotStartWith(prefix);
    }
}
