package mx;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;

class S05RemoveVowelsTest {
    @Test
    void removeVowelsPlain() {
        String actual = S05.removeVowels("example");

        assertThat(actual, is("xmpl"));
    }
}
