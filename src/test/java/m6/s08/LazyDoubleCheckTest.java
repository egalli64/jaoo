package m6.s08;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class LazyDoubleCheckTest {
    @Test
    void getInstance() {
        LazyDoubleCheck unique = LazyDoubleCheck.getInstance();
        LazyDoubleCheck single = LazyDoubleCheck.getInstance();

        assertThat(unique, is(single));
    }

    @Test
    void solution() {
        assertThat(LazyDoubleCheck.getInstance().solution(), is(42));
    }
}
