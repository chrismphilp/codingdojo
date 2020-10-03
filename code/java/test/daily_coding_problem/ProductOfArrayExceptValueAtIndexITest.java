package daily_coding_problem;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class ProductOfArrayExceptValueAtIndexITest {

    ProductOfArrayExceptValueAtIndexI productOfArrayExceptValueAtIndexI;

    @Before
    public void setup() {
        productOfArrayExceptValueAtIndexI = new ProductOfArrayExceptValueAtIndexI();
    }

    @Test
    public void empty_array_should_return_empty_array() {
        assertArrayEquals(new int[]{}, productOfArrayExceptValueAtIndexI.calculate(new int[]{}));
    }

    @Test
    public void array_should_return_correct_array() {
        assertArrayEquals(new int[]{120, 60, 40, 30, 24}, productOfArrayExceptValueAtIndexI.calculate(new int[]{1, 2, 3, 4, 5}));
        assertArrayEquals(new int[]{2, 3, 6}, productOfArrayExceptValueAtIndexI.calculate(new int[]{3, 2, 1}));
        assertArrayEquals(new int[]{100, 100, 100}, productOfArrayExceptValueAtIndexI.calculate(new int[]{10, 10, 10}));
        assertArrayEquals(new int[]{1, 2}, productOfArrayExceptValueAtIndexI.calculate(new int[]{2, 1}));
    }
}
