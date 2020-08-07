package m4.s14;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.Matchers.containsInAnyOrder;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class ExerciseTest {

	@Test
	void singlesLinearClassicOne() {
		Exercise ex = new Exercise();

		List<Integer> expected = Arrays.asList(3);
		List<Integer> actual = ex.singlesLinearClassic(new int[] { 23, 3, 23 });
		assertThat(actual, is(expected));
	}

	@Test
	void singlesLinearClassicCouple() {
		Exercise ex = new Exercise();

		int[] data = { 23, 43, 23, 25 };

		List<Integer> expected = Arrays.asList(25, 43);
		List<Integer> actual = ex.singlesLinearClassic(data);
		assertThat(actual, is(expected));
	}

	@Test
	void singlesLinearClassicCouple2() {
		Exercise ex = new Exercise();

		int[] data = { 23, 43, 23, 25 };

		List<Integer> expected = Arrays.asList(25, 43);

		List<Integer> actual = ex.singlesLinearClassic(data);
		actual.sort(null);
		assertThat(actual, is(expected));
	}

	@Test
	void singlesLinearClassicCouple3() {
		Exercise ex = new Exercise();

		int[] data = { 23, 43, 23, 25 };

		List<Integer> expected = Arrays.asList(25, 43);

		List<Integer> actual = ex.singlesLinearClassic(data);
		assertThat(actual.size(), is(expected.size()));
		assertThat(actual, containsInAnyOrder(expected.toArray()));
	}

}
