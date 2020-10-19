package mx;

public class Sorting {
    public static void swap(int[] data, int i, int j) {
        int temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }

    public static void bubbleSort(int[] data) {
        // TODO
    }

    public static void selectionSort(int[] data) {
        // TODO
    }

    public static void insertionSort(int[] data) {
        // TODO
    }

    private static void merge(int[] data, int left, int pivot, int right) {
        // TODO
    }

    private static void mergeSort(int[] data, int left, int right) {
        // TODO
        int pivot = (left + right) / 2;
        merge(data, left, pivot, right);
    }

    public static void mergeSort(int[] data) {
        mergeSort(data, 0, data.length - 1);
    }

    /**
     * Partition a section of an array, smallest values on the left
     * 
     * @param data  the array to be partitioned
     * @param left  first element index
     * @param right last element index
     * @return pivot index
     */
    private static int partition(int[] data, int left, int right) {
        // TODO
        return 0;
    }

    private static void quickSort(int[] data, int left, int right) {
        // TODO
        partition(data, left, right);
    }

    public static void quickSort(int[] data) {
        quickSort(data, 0, data.length - 1);
    }
}
