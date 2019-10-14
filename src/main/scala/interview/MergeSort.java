package interview;

public class MergeSort {
    public int[] mergesort(int[] array) {
        int halfLength = array.length / 2;
        int[] left = new int[halfLength / 2];
        int[] right = new int [halfLength / 2 - 1];

        for (int i : array) {
            if (i <= halfLength) left[i] = array[i];
            else right[i - halfLength] = array[i];
        }

        return null;
    }
}
