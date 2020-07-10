package m1ex;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;

class SortingTest {
	@Test
	void bubbleSortReverted() {
		int[] data = { 5, 4, 3, 2, 1 };

		Sorting.bubbleSort(data);

		assertThat(data[0], is(1));
		assertThat(data[1], is(2));
		assertThat(data[2], is(3));
		assertThat(data[3], is(4));
		assertThat(data[4], is(5));
	}

	@Test
	void bubbleSortOrdered() {
		int[] data = { 1, 2, 3, 4, 5 };

		Sorting.bubbleSort(data);

		assertThat(data[0], is(1));
		assertThat(data[1], is(2));
		assertThat(data[2], is(3));
		assertThat(data[3], is(4));
		assertThat(data[4], is(5));
	}

	@Test
	void bubbleSortMixed() {
		int[] data = { 3, 2, 5, 1, 4 };

		Sorting.bubbleSort(data);

		assertThat(data[0], is(1));
		assertThat(data[1], is(2));
		assertThat(data[2], is(3));
		assertThat(data[3], is(4));
		assertThat(data[4], is(5));
	}

	@Test
	void selectionSortReverted() {
		int[] data = { 5, 4, 3, 2, 1 };

		Sorting.selectionSort(data);

		assertThat(data[0], is(1));
		assertThat(data[1], is(2));
		assertThat(data[2], is(3));
		assertThat(data[3], is(4));
		assertThat(data[4], is(5));
	}

	@Test
	void selectionSortOrdered() {
		int[] data = { 1, 2, 3, 4, 5 };

		Sorting.selectionSort(data);

		assertThat(data[0], is(1));
		assertThat(data[1], is(2));
		assertThat(data[2], is(3));
		assertThat(data[3], is(4));
		assertThat(data[4], is(5));
	}

	@Test
	void selectionSortMixed() {
		int[] data = { 3, 2, 5, 1, 4 };

		Sorting.selectionSort(data);

		assertThat(data[0], is(1));
		assertThat(data[1], is(2));
		assertThat(data[2], is(3));
		assertThat(data[3], is(4));
		assertThat(data[4], is(5));
	}

	@Test
	void insertionSortReverted() {
		int[] data = { 5, 4, 3, 2, 1 };

		Sorting.insertionSort(data);

		assertThat(data[0], is(1));
		assertThat(data[1], is(2));
		assertThat(data[2], is(3));
		assertThat(data[3], is(4));
		assertThat(data[4], is(5));
	}

	@Test
	void insertionSortOrdered() {
		int[] data = { 1, 2, 3, 4, 5 };

		Sorting.insertionSort(data);

		assertThat(data[0], is(1));
		assertThat(data[1], is(2));
		assertThat(data[2], is(3));
		assertThat(data[3], is(4));
		assertThat(data[4], is(5));
	}

	@Test
	void insertionSortMixed() {
		int[] data = { 3, 2, 5, 1, 4 };

		Sorting.bubbleSort(data);

		assertThat(data[0], is(1));
		assertThat(data[1], is(2));
		assertThat(data[2], is(3));
		assertThat(data[3], is(4));
		assertThat(data[4], is(5));
	}
}
