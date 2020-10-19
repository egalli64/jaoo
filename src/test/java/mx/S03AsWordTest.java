package mx;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;

class S03AsWordTest {
    @Test
    void asWordZero() {
        String actual = S03.asWord(0);

        assertThat(actual, is("zero"));
    }

    @Test
    void asWordOther() {
        String actual = S03.asWord(42);

        assertThat(actual, is("other"));
    }
}
