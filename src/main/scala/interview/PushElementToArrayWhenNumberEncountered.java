package interview;

public class PushElementToArrayWhenNumberEncountered {
    public int[] pushElementToArrayWhenNumberEncountered(int[] arrayOfNumbers, int numberToFind) {

        int count = 0;
        int arrayLength = arrayOfNumbers.length;
        for (int i = 0; i < arrayLength - 1; i++) {
            if (arrayOfNumbers[i] == numberToFind) count++;
        }

        int currentIndex = arrayLength - 1;
        for (int i = (arrayLength - 1 - count); i >= 0; i--) {
            if (arrayOfNumbers[i] == numberToFind && i != arrayLength - 1) {
                arrayOfNumbers[currentIndex--] = 2;
                arrayOfNumbers[currentIndex] = arrayOfNumbers[i];
            } else {
                arrayOfNumbers[currentIndex] = arrayOfNumbers[i];
            }
            currentIndex--;
        }
        return arrayOfNumbers;
    }
}
