package m6.s09;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class LazyInnerTest {
    @Test
    void getInstance() {
        LazyInner unique = LazyInner.getInstance();
        LazyInner single = LazyInner.getInstance();

        assertThat(unique, is(single));
    }

    @Test
    void solution() {
        assertThat(LazyInner.getInstance().solution(), is(42));
    }
}
