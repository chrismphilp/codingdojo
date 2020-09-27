package leet_code.medium;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ThreeSumTest {

    private ThreeSum threeSum;

    @Before
    public void setup() {
        threeSum = new ThreeSum();
    }

    @Test
    public void should_return_an_empty_list_if_the_length_is_less_than_three() {
        assertEquals(0, threeSum.threeSum(new int[]{}).size());
        assertEquals(0, threeSum.threeSum(new int[]{0}).size());
        assertEquals(0, threeSum.threeSum(new int[]{0, 1}).size());
    }

    @Test
    public void should_return_an_empty_list_if_the_values_cannot_form_a_solution() {
        assertEquals(0, threeSum.threeSum(new int[]{1, 2, 3}).size());
        assertEquals(0, threeSum.threeSum(new int[]{0, 0, 1}).size());
    }

    @Test
    public void should_return_correct_single_list_if_the_values_can_form_a_solution() {
        List<List<Integer>> result = threeSum.threeSum(new int[]{2, 5, -7});
        assertEquals(1, result.size());
        assertTrue(result.get(0).containsAll(Arrays.asList(2, 5, -7)));
    }

    @Test
    public void should_return_correct_multiple_list_if_the_values_can_form_a_solution() {
        List<List<Integer>> result = threeSum.threeSum(new int[]{-1, 0, 1, 2, -1, -4});
        assertEquals(2, result.size());
        assertTrue(result.get(0).containsAll(Arrays.asList(-1, -1, 2)));
        assertTrue(result.get(1).containsAll(Arrays.asList(-1, 0, 1)));
    }
}
