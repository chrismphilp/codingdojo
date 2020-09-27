package leet_code.easy;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NUniqueIntegersToAddToZeroTest {

    private NUniqueIntegersToAddToZero nUniqueIntegersToAddToZero;

    @Before
    public void setup() {
        nUniqueIntegersToAddToZero = new NUniqueIntegersToAddToZero();
    }

    @Test
    public void when_n_is_one_should_return_zero() {
        assertEquals(0, sum(nUniqueIntegersToAddToZero.sumZero(1)));
    }

    @Test
    public void should_all_sum_to_zero_when_array_is_returned() {
        assertEquals(0, sum(nUniqueIntegersToAddToZero.sumZero(5)));
        assertEquals(0, sum(nUniqueIntegersToAddToZero.sumZero(4)));
        assertEquals(0, sum(nUniqueIntegersToAddToZero.sumZero(8)));
        assertEquals(0, sum(nUniqueIntegersToAddToZero.sumZero(500)));
        assertEquals(0, sum(nUniqueIntegersToAddToZero.sumZero(2)));
        assertEquals(0, sum(nUniqueIntegersToAddToZero.sumZero(9)));
    }

    private int sum(int[] A) {
        int sum = 0;
        for (int i : A) sum += i;
        return sum;
    }
}
