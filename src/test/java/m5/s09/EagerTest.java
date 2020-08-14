package m5.s09;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class EagerTest {
    @Test
    void getInstance() {
        Eager unique = Eager.getInstance();
        Eager single = Eager.getInstance();

        assertThat(unique, is(single));
    }

//    @Test
//    void solution() {
//        assertThat(Eager.getInstance().solution(), is(42));
//    }
}
