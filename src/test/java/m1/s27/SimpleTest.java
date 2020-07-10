package m1.s27;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import m1.s27.Simple;

class SimpleTest {
    private Simple simple;

    @BeforeEach
    public void init() {
        simple = new Simple();
    }

    @Test
    public void negatePositive() {
        int value = 42;

        int result = simple.negate(value);

        assertThat(result, equalTo(-42));
    }
}
