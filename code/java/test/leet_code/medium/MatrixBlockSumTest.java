package leet_code.medium;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

@ExtendWith(MockitoExtension.class)
public class MatrixBlockSumTest {

    @InjectMocks
    private MatrixBlockSum matrixBlockSum;

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
