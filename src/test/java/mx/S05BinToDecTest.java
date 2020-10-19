package mx;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;

class S05BinToDecTest {
    @Test
    void bin2decPlain() {
        int actual = S05.bin2dec("1001");

        assertThat(actual, is(9));
    }
}
