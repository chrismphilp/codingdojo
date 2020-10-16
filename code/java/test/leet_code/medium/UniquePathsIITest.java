package leet_code.medium;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UniquePathsIITest {

    private UniquePathsII uniquePathsII;

    @Before
    public void setup() {
        uniquePathsII = new UniquePathsII();
    }

    @Test
    public void should_return_zero_if_start_or_end_point_is_blocked() {
        assertEquals(0, uniquePathsII.uniquePathsWithObstacles(new int[][]{
                {0, 1},
                {0, 1}
        }));
        assertEquals(0, uniquePathsII.uniquePathsWithObstacles(new int[][]{
                {0, 1},
                {1, 0}
        }));
        assertEquals(0, uniquePathsII.uniquePathsWithObstacles(new int[][]{
                {1, 0},
                {0, 0}
        }));
        assertEquals(0, uniquePathsII.uniquePathsWithObstacles(new int[][]{
                {1, 0, 0, 1},
                {0, 0, 1, 0},
                {0, 0, 1, 0}
        }));
    }

    @Test
    public void should_return_correct_result_for_grids() {
        assertEquals(2, uniquePathsII.uniquePathsWithObstacles(new int[][]{
                {0, 0, 0},
                {0, 1, 0},
                {0, 0, 0},
        }));
        assertEquals(1, uniquePathsII.uniquePathsWithObstacles(new int[][]{
                {0, 0, 1, 0},
                {0, 1, 0, 0},
                {0, 0, 0, 0},
        }));
    }
}
