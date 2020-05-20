package daily_coding_problem;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TwoNumbersFromListAddToKTest {

    TwoNumbersFromListAddToK twoNumbersFromListAddToK;

    @Before
    public void setup() {
        twoNumbersFromListAddToK = new TwoNumbersFromListAddToK();
    }

    @Test
    public void empty_test_should_return_false() {
        assertFalse(twoNumbersFromListAddToK.calculate(new int[0], 0));
    }

    @Test
    public void array_with_no_answer_should_return_false() {
        assertFalse(twoNumbersFromListAddToK.calculate(new int[]{0, 1, 6, 2}, 5));
        assertFalse(twoNumbersFromListAddToK.calculate(new int[]{5, 1, 6, 2}, 5));
    }

    @Test
    public void array_with_answer_should_return_true() {
        assertTrue(twoNumbersFromListAddToK.calculate(new int[]{0, 1, 5, 7, 2}, 9));
        assertTrue(twoNumbersFromListAddToK.calculate(new int[]{0, 1, 3, 5, 7, 2}, 5));
        assertTrue(twoNumbersFromListAddToK.calculate(new int[]{0, 1, 3, 5, 7, 2}, 3));
    }
}
