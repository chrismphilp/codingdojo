package leet_code.medium;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class MatrixBlockSumTest {

    private MatrixBlockSum matrixBlockSum;

    @Before
    public void setup() {
        matrixBlockSum = new MatrixBlockSum();
    }

    @Test
    public void should_return_an_empty_array_for_empty_array() {
        int[][] result = matrixBlockSum.matrixBlockSum(new int[][]{{}}, 1);
        assertEquals(1, result.length);
    }

    @Test
    public void should_return_the_correct_array_for_example_one() {
        int[][] result = matrixBlockSum.matrixBlockSum(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}, 1);
        assertArrayEquals(new int[]{12, 21, 16}, result[0]);
        assertArrayEquals(new int[]{27, 45, 33}, result[1]);
        assertArrayEquals(new int[]{24, 39, 28}, result[2]);
    }

    @Test
    public void should_return_the_correct_array_for_example_two() {
        int[][] result = matrixBlockSum.matrixBlockSum(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}, 2);
        assertArrayEquals(new int[]{45, 45, 45}, result[0]);
        assertArrayEquals(new int[]{45, 45, 45}, result[1]);
        assertArrayEquals(new int[]{45, 45, 45}, result[2]);
    }
}
