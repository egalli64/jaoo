package ex;

public class Sorting {
	private static void swap(int[] data, int i, int j) {
		int temp = data[i];
		data[i] = data[j];
		data[j] = temp;
	}

	public static void bubbleSort(int[] data) {
		boolean swapped;

		do {
			swapped = false;

			for (int i = 0; i < data.length - 1; i++) {
				if (data[i] > data[i + 1]) {
					swap(data, i, i + 1);
					swapped = true;
				}
			}
		} while (swapped);
	}

	public static void selectionSort(int[] data) {
		for (int i = 0; i < data.length - 1; i++) {
			int pos = i;
			for (int j = i + 1; j < data.length; j++) {
				if (data[j] < data[pos]) {
					pos = j;
				}
			}
			if (pos != i) {
				swap(data, i, pos);
			}
		}
	}

	public static void insertionSort(int[] data) {
		for (int i = 1; i < data.length; i++) {
			int cur = data[i];

			int j = i - 1;
			for (; j > -1 && data[j] > cur; j--) {
				data[j + 1] = data[j];
			}
			data[j + 1] = cur;
		}
	}
}
