package interview;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArrangeNumbersArrayToGiveTheBiggestNumberTest {

    private ArrangeNumbersArrayToGiveTheBiggestNumber arrangeNumbersArrayToGiveTheBiggestNumber;

    @BeforeEach
    public void setup() {
        arrangeNumbersArrayToGiveTheBiggestNumber = new ArrangeNumbersArrayToGiveTheBiggestNumber();
    }

    @Test
    public void number_comparison_should_be_correct() {
        assertTrue(arrangeNumbersArrayToGiveTheBiggestNumber.compareValues(55, 115));
        assertFalse(arrangeNumbersArrayToGiveTheBiggestNumber.compareValues(1111, 9));
        assertFalse(arrangeNumbersArrayToGiveTheBiggestNumber.compareValues(1, 1));
    }

    @Test
    public void quicksort_should_return_correct_array() {
        int[] testArrayOne = {9, 5, 57, 81, 9};
        arrangeNumbersArrayToGiveTheBiggestNumber.quicksortArray(testArrayOne, 0, testArrayOne.length - 1);
        assertArrayEquals(new int[]{9, 9, 81, 57, 5}, testArrayOne);

        int[] testArrayTwo = {1, 5, 1, 4, 5, 6, 8};
        arrangeNumbersArrayToGiveTheBiggestNumber.quicksortArray(testArrayTwo, 0, testArrayTwo.length - 1);
        assertArrayEquals(new int[]{8, 6, 5, 5, 4, 1, 1}, testArrayTwo);
    }


    @Test
    public void empty_array_should_return_max_value() {
        int[] emptyArray = new int[0];
        assertEquals(0, arrangeNumbersArrayToGiveTheBiggestNumber.arrangeNumbersArrayToGiveTheBiggestNumber(emptyArray));
    }

    @Test
    public void filled_array_should_return_correct_value() {
        int[] filledArray = {0, 1, 2, 3, 4, 5};
        assertEquals(543210, arrangeNumbersArrayToGiveTheBiggestNumber.arrangeNumbersArrayToGiveTheBiggestNumber(filledArray));
    }
}
