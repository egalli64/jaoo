package mx;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;

import mx.S05;

class S05Test {

	@Test
	void reverseStringPlain() {
		String actual = S05.reverse("abc");

		assertThat(actual, is("cba"));
	}

	@Test
	void isPalindromePlain() {
		boolean actual = S05.isPalindrome("abba");

		assertThat(actual, is(true));
	}

	@Test
	void removeVowelsPlain() {
		String actual = S05.removeVowels("example");

		assertThat(actual, is("xmpl"));
	}

	@Test
	void bin2decPlain() {
		int actual = S05.bin2dec("1001");

		assertThat(actual, is(9));
	}

	@Test
	void reverseIntArrayPlain() {
		int[] original = new int[] { 1, 2, 3 };
		int[] actual = S05.reverse(original);

		assertThat(actual.length, is(original.length));
		for (int i = 0; i < original.length; i++) {
			assertThat(actual[i], is(original[original.length - i - 1]));
		}
	}

	@Test
	void averagePlain() {
		double actual = S05.average(new int[] { 1, 2, 3 });

		assertThat(actual, is(2.0));
	}

	@Test
	void maxPlain() {
		int actual = S05.max(new int[] { 2, 3, 1 });

		assertThat(actual, is(3));
	}
}
