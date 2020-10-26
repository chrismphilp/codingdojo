package leet_code.medium;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BulbSwitcherIVTest {

    private BulbSwitcherIV bulbSwitcherIV;

    @Before
    public void setup() {
        bulbSwitcherIV = new BulbSwitcherIV();
    }

    @Test
    public void should_return_correct_result_for_example_one() {
        assertEquals(3, bulbSwitcherIV.minFlips("10111"));
    }

    @Test
    public void should_return_correct_result_for_example_two() {
        assertEquals(3, bulbSwitcherIV.minFlips("101"));
    }

    @Test
    public void should_return_correct_result_for_example_three() {
        assertEquals(0, bulbSwitcherIV.minFlips("00000"));
    }

    @Test
    public void should_return_correct_result_for_example_four() {
        assertEquals(5, bulbSwitcherIV.minFlips("001011101"));
    }

    @Test
    public void should_return_correct_result_for_all_ones() {
        assertEquals(1, bulbSwitcherIV.minFlips("11111111111"));
    }
}
