package mx;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;

class SortingTest {
    static private final int[] expected = { 1, 2, 3, 4, 5 };

    @Test
    void bubbleSortReverted() {
        int[] data = { 5, 4, 3, 2, 1 };

        Sorting.bubbleSort(data);

        assertThat(data, is(expected));
    }

    @Test
    void bubbleSortOrdered() {
        int[] data = { 1, 2, 3, 4, 5 };

        Sorting.bubbleSort(data);

        assertThat(data, is(expected));
    }

    @Test
    void bubbleSortMixed() {
        int[] data = { 3, 2, 5, 1, 4 };

        Sorting.bubbleSort(data);

        assertThat(data, is(expected));
    }

    @Test
    void selectionSortReverted() {
        int[] data = { 5, 4, 3, 2, 1 };

        Sorting.selectionSort(data);

        assertThat(data, is(expected));
    }

    @Test
    void selectionSortOrdered() {
        int[] data = { 1, 2, 3, 4, 5 };

        Sorting.selectionSort(data);

        assertThat(data, is(expected));
    }

    @Test
    void selectionSortMixed() {
        int[] data = { 3, 2, 5, 1, 4 };

        Sorting.selectionSort(data);

        assertThat(data, is(expected));
    }

    @Test
    void insertionSortReverted() {
        int[] data = { 5, 4, 3, 2, 1 };

        Sorting.insertionSort(data);

        assertThat(data, is(expected));
    }

    @Test
    void insertionSortOrdered() {
        int[] data = { 1, 2, 3, 4, 5 };

        Sorting.insertionSort(data);

        assertThat(data, is(expected));
    }

    @Test
    void insertionSortMixed() {
        int[] data = { 3, 2, 5, 1, 4 };

        Sorting.insertionSort(data);

        assertThat(data, is(expected));
    }
}
