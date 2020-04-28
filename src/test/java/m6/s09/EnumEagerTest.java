package m6.s09;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class EnumEagerTest {
    @Test
    void getInstance() {
        EnumEager unique = EnumEager.INSTANCE;

        assertThat(unique, is(EnumEager.INSTANCE));
    }

    @Test
    void solution() {
        assertThat(EnumEager.INSTANCE.solution(), is(42));
    }
}
