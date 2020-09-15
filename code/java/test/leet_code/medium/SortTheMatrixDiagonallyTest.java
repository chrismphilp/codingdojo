package leet_code.medium;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SortTheMatrixDiagonallyTest {

    private SortTheMatrixDiagonally sortTheMatrixDiagonally;

    @Before
    public void setup() {
        sortTheMatrixDiagonally = new SortTheMatrixDiagonally();
    }

    @Test
    public void should_return_empty_array_for_empty_array_input() {
        assertArrayEquals(new int[][]{{}}, sortTheMatrixDiagonally.diagonalSort(new int[][]{{}}));
    }

    @Test
    public void should_return_correct_output_for_valid_input() {
        int[][] result = sortTheMatrixDiagonally.diagonalSort(new int[][]{
                {3, 3, 1, 1},
                {2, 2, 1, 2},
                {1, 1, 1, 2}
        });
        int[][] expected = new int[][]{
                {1, 1, 1, 1},
                {1, 2, 2, 2},
                {1, 2, 3, 3}
        };
        for (int i = 0; i < result.length; i++) {
            assertArrayEquals(expected[i], result[i]);
        }
    }
}
