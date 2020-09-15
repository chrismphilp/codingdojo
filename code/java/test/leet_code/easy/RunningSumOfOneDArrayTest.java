package leet_code.easy;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class RunningSumOfOneDArrayTest {

    private RunningSumOfOneDArray runningSumOfOneDArray;

    @Before
    public void setup() {
        runningSumOfOneDArray = new RunningSumOfOneDArray();
    }

    @Test
    public void empty_arrays_should_return_empty_array() {
        assertArrayEquals(new int[]{}, runningSumOfOneDArray.runningSum(new int[]{}));
    }

    @Test
    public void non_empty_arrays_should_return_the_correct_result() {
        assertArrayEquals(new int[]{1}, runningSumOfOneDArray.runningSum(new int[]{1}));
        assertArrayEquals(new int[]{1, 3}, runningSumOfOneDArray.runningSum(new int[]{1, 2}));
        assertArrayEquals(new int[]{1, 3, 6, 10}, runningSumOfOneDArray.runningSum(new int[]{1, 2, 3, 4}));
        assertArrayEquals(new int[]{1, 2, 3, 4}, runningSumOfOneDArray.runningSum(new int[]{1, 1, 1, 1}));
        assertArrayEquals(new int[]{10, 15, 35, 38}, runningSumOfOneDArray.runningSum(new int[]{10, 5, 20, 3}));
    }
}
