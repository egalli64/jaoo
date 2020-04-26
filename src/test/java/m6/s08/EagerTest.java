package m6.s08;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class EagerTest {
    @Test
    void getInstance() {
        Eager unique = Eager.getInstance();
        Eager single = Eager.getInstance();

        assertThat(unique, is(single));
    }

    @Test
    void solution() {
        assertThat(Eager.getInstance().solution(), is(42));
    }
}
