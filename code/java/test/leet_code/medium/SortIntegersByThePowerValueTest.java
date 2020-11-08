package leet_code.medium;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SortIntegersByThePowerValueTest {

    private SortIntegersByThePowerValue sortIntegersByThePowerValue;

    @Before
    public void setUp() {
        sortIntegersByThePowerValue = new SortIntegersByThePowerValue();
    }

    @Test
    public void should_return_the_correct_array_for_example_one() {
        Assert.assertEquals(12, sortIntegersByThePowerValue.getKth(12, 15, 1));
        Assert.assertEquals(13, sortIntegersByThePowerValue.getKth(12, 15, 2));
        Assert.assertEquals(14, sortIntegersByThePowerValue.getKth(12, 15, 3));
        Assert.assertEquals(15, sortIntegersByThePowerValue.getKth(12, 15, 4));
    }

    @Test
    public void should_return_the_correct_array_for_example_two() {
        Assert.assertEquals(1, sortIntegersByThePowerValue.getKth(1, 1, 1));
    }

    @Test
    public void should_return_the_correct_array_for_example_three() {
        Assert.assertEquals(7, sortIntegersByThePowerValue.getKth(7, 11, 4));
    }

    @Test
    public void should_return_the_correct_array_for_example_four() {
        Assert.assertEquals(13, sortIntegersByThePowerValue.getKth(10, 20, 5));
    }

    @Test
    public void should_return_the_correct_array_for_example_five() {
        Assert.assertEquals(570, sortIntegersByThePowerValue.getKth(1, 1000, 777));
    }
}