package interview;

public class QuickSort {
    public void quicksortArray(int[] arrayOfNumbers, int startingIndex, int endingIndex) {
        if (startingIndex < endingIndex) {
            int partitionPoint = partitionArray(arrayOfNumbers, startingIndex, endingIndex);

            quicksortArray(arrayOfNumbers, startingIndex, partitionPoint - 1);
            quicksortArray(arrayOfNumbers, partitionPoint + 1, endingIndex);
        }
    }

    public int partitionArray(int[] arrayOfNumbers, int startingIndex, int endingIndex) {
        int pivotPoint = arrayOfNumbers[endingIndex];

        for (int i = startingIndex; i < endingIndex; i++) {
            if (arrayOfNumbers[i] < pivotPoint) {

                int temp = arrayOfNumbers[startingIndex];
                arrayOfNumbers[startingIndex] = arrayOfNumbers[i];
                arrayOfNumbers[i] = temp;

                startingIndex++;
            }
        }
        int temp = arrayOfNumbers[startingIndex];
        arrayOfNumbers[startingIndex] = arrayOfNumbers[endingIndex];
        arrayOfNumbers[endingIndex] = temp;

        return startingIndex;
    }
}
