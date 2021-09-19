package m04.s06;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.withPrecision;
import static org.junit.jupiter.api.Assertions.*;

class SimpleTest {
    @Test
    void checkTrue() {
        boolean condition = isPositive(12);
        assertTrue(condition);
    }

    @Test
    void checkNull() {
        String reference = nullIfPositive(42);
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
        boolean actual = isPositive(42);
        assertThat(actual).isTrue();
    }

    @Test
    void ajEqTrue() {
        boolean actual = isPositive(42);
        assertThat(actual).isEqualTo(true);
    }

    @Test
    void ajNull() {
        String actual = nullIfPositive(12);
        assertThat(actual).isNull();
    }

    @Test
    void ajEqNull() {
        String actual = nullIfPositive(42);
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

    private boolean isPositive(int value) {
        return value > 0;
    }

    private String nullIfPositive(int value) {
        return value > 0 ? null : "not a null";
    }
}
