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
    public void should_return_correct_result_for_single_element_array() {
        assertEquals(0, uniquePaths.uniquePaths(1, 2));
    }
}
