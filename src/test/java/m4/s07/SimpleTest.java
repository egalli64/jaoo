package m4.s07;

import static org.junit.jupiter.api.Assertions.assertThrows;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;
import org.junit.jupiter.api.Test;

public class SimpleTest {
    @Test
    public void negateMinInt() {
        var sample = new m4.s05.Simple();

        var exc = assertThrows(IllegalArgumentException.class, () -> sample.negate(Integer.MIN_VALUE));
        assertThat(exc.getMessage(), is("Can't negate MIN_VALUE"));
    }
}
