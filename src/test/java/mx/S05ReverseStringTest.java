package mx;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;

class S05ReverseStringTest {
    @Test
    void reverseStringPlain() {
        String actual = S05.reverse("abc");

        assertThat(actual, is("cba"));
    }
}
