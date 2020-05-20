package leet_code.easy;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxConsecutiveOnesTest {

    private MaxConsecutiveOnes maxConsecutiveOnes;

    @Before
    public void setup() {
        maxConsecutiveOnes = new MaxConsecutiveOnes();
    }

    @Test
    public void should_return_zero_for_empty_array() {
        int[] emptyArray = new int[0];
        assertEquals(0, maxConsecutiveOnes.findMaxConsecutiveOnes(emptyArray));
    }

    @Test
    public void should_return_the_correct_result_for_arrays() {
        assertEquals(3, maxConsecutiveOnes.findMaxConsecutiveOnes(new int[]{0, 1, 0, 1, 1, 1}));
        assertEquals(2, maxConsecutiveOnes.findMaxConsecutiveOnes(new int[]{0, 1, 0, 1, 1, 0, 0, 1, 1}));
        assertEquals(4, maxConsecutiveOnes.findMaxConsecutiveOnes(new int[]{0, 1, 1, 1, 1, 0, 0, 1, 1}));
        assertEquals(5, maxConsecutiveOnes.findMaxConsecutiveOnes(new int[]{1, 1, 1, 1, 1}));
        assertEquals(0, maxConsecutiveOnes.findMaxConsecutiveOnes(new int[]{0, 0, 0, 0, 0}));
    }
}
