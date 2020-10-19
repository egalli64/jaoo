package mx;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.closeTo;

import org.junit.jupiter.api.Test;

class S02EngineTest {
    @Test
    void engineCapacityPlain() {
        double actual = S02.engineCapacity(74, 75, 4);

        assertThat(actual, closeTo(1290.252, 0.001));
    }
}
