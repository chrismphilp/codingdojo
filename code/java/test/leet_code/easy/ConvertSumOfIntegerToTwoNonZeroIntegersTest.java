package leet_code.easy;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class ConvertSumOfIntegerToTwoNonZeroIntegersTest {

    private ConvertSumOfIntegerToTwoNonZeroIntegers convertSumOfIntegerToTwoNonZeroIntegers;

    @Before
    public void setup() {
        convertSumOfIntegerToTwoNonZeroIntegers = new ConvertSumOfIntegerToTwoNonZeroIntegers();
    }

    @Test
    public void should_return_correct_non_zero_integers_test_one() {
        int[] result = convertSumOfIntegerToTwoNonZeroIntegers.getNoZeroIntegers(5);
        assertFalse(Integer.toString(result[0]).contains("0"));
        assertFalse(Integer.toString(result[1]).contains("0"));
        assertEquals(5, result[0] + result[1]);
    }

    @Test
    public void should_return_correct_non_zero_integers_test_two() {
        int[] result = convertSumOfIntegerToTwoNonZeroIntegers.getNoZeroIntegers(50);
        assertFalse(Integer.toString(result[0]).contains("0"));
        assertFalse(Integer.toString(result[1]).contains("0"));
        assertEquals(50, result[0] + result[1]);
    }

    @Test
    public void should_return_correct_non_zero_integers_test_three() {
        int[] result = convertSumOfIntegerToTwoNonZeroIntegers.getNoZeroIntegers(9);
        assertFalse(Integer.toString(result[0]).contains("0"));
        assertFalse(Integer.toString(result[1]).contains("0"));
        assertEquals(9, result[0] + result[1]);
    }
}
