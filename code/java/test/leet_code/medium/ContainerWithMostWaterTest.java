package leet_code.medium;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ContainerWithMostWaterTest {

    private ContainerWithMostWater containerWithMostWater;

    @Before
    public void setup() {
        containerWithMostWater = new ContainerWithMostWater();
    }

    @Test
    public void tuple_array_should_return_correct_result() {
        int[] heights = new int[]{1, 8};
        assertEquals(1, containerWithMostWater.maxArea(heights));
    }

    @Test
    public void arrays_with_all_same_values_should_return_correct_result() {
        int[] heights = new int[]{1,1,1,1,1};
        assertEquals(4, containerWithMostWater.maxArea(heights));
    }

    @Test
    public void provided_input_should_return_correct_result() {
        int[] heights = new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7};
        assertEquals(49, containerWithMostWater.maxArea(heights));
    }

    @Test
    public void large_height_input_in_close_proximity_should_return_correct_result() {
        int[] heights = new int[]{1,2,4,3};
        assertEquals(4, containerWithMostWater.maxArea(heights));
    }
}
