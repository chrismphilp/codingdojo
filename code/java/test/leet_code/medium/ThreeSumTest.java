package leet_code.medium;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

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
        assertEquals(0, threeSum.threeSum(new int[]{1,2,3}).size());
        assertEquals(0, threeSum.threeSum(new int[]{0,0,1}).size());
    }
}
