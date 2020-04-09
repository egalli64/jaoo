package m2.s24;

import static org.junit.jupiter.api.Assertions.assertThrows;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;
import org.junit.jupiter.api.Test;

public class SimpleTest {
    @Test
    public void negateMinInt() {
        var sample = new m2.s22.Simple();

        var exc = assertThrows(IllegalArgumentException.class, () -> sample.negate(Integer.MIN_VALUE));
        assertThat(exc.getMessage(), is("Can't negate MIN_VALUE"));
    }
}
