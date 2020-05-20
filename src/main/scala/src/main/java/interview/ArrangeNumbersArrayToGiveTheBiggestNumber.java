package interview;

public class ArrangeNumbersArrayToGiveTheBiggestNumber {
    public int arrangeNumbersArrayToGiveTheBiggestNumber(int[] arrayOfNumbers) {
        int arrayLength = arrayOfNumbers.length;
        if (arrayLength == 0) return 0;
        quicksortArray(arrayOfNumbers, 0 , arrayLength - 1);

        StringBuilder stringBuilder = new StringBuilder();
        for (int value : arrayOfNumbers) stringBuilder.append(value);
        return Integer.parseInt(stringBuilder.toString());
    }

    public void quicksortArray(int[] arrayOfNumbers, int startingIndex, int endingIndex) {
        if (startingIndex < endingIndex) {
            int partitionPoint = partitionArray(arrayOfNumbers, startingIndex, endingIndex);

            quicksortArray(arrayOfNumbers, startingIndex, partitionPoint - 1);
            quicksortArray(arrayOfNumbers, partitionPoint + 1, endingIndex);
        }
    }

    public int partitionArray(int[] arrayOfNumbers, int startingIndex, int endingIndex) {
        int pivotPoint = arrayOfNumbers[endingIndex];
        int smallestIndex = startingIndex;

        for (int i = startingIndex; i < endingIndex; i++) {
            if (compareValues(arrayOfNumbers[i], pivotPoint)) {

                int temp = arrayOfNumbers[smallestIndex];
                arrayOfNumbers[smallestIndex] = arrayOfNumbers[i];
                arrayOfNumbers[i] = temp;

                smallestIndex++;
            }
        }
        int temp = arrayOfNumbers[smallestIndex];
        arrayOfNumbers[smallestIndex] = arrayOfNumbers[endingIndex];
        arrayOfNumbers[endingIndex] = temp;

        return smallestIndex;
    }

    public boolean compareValues(int a, int b) {
        String aStr = Integer.toString(a);
        String bStr = Integer.toString(b);
        int firstCombination = Integer.parseInt(aStr + bStr);
        int secondCombination = Integer.parseInt(bStr + aStr);
        return firstCombination > secondCombination;
    }
}
