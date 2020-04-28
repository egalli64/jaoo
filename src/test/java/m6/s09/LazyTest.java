package m6.s09;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class LazyTest {
    @Test
    void getInstance() {
        Lazy unique = Lazy.getInstance();
        Lazy single = Lazy.getInstance();

        assertThat(unique, is(single));
    }

    @Test
    void solution() {
        assertThat(Lazy.getInstance().solution(), is(42));
    }
}
