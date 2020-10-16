package leet_code.medium;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UniquePathsTest {

    private UniquePaths uniquePaths;

    @Before
    public void setup() {
        uniquePaths = new UniquePaths();
    }

    @Test
    public void should_return_one_for_one_by_any_grid() {
        assertEquals(1, uniquePaths.uniquePaths(1, 1));
        assertEquals(1, uniquePaths.uniquePaths(5, 1));
        assertEquals(1, uniquePaths.uniquePaths(1, 5));
    }

    @Test
    public void should_return_correct_result_for_grids() {
        assertEquals(28, uniquePaths.uniquePaths(3, 7));
        assertEquals(70, uniquePaths.uniquePaths(5, 5));
        assertEquals(8, uniquePaths.uniquePaths(8, 2));
        assertEquals(48620, uniquePaths.uniquePaths(10, 10));
    }
}
