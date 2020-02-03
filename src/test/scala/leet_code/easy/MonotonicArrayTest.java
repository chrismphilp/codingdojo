package leet_code.easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MonotonicArrayTest {

    private MonotonicArray monotonicArray;

    @BeforeEach
    public void setup() {
        monotonicArray = new MonotonicArray();
    }

    @Test
    public void non_monotonic_arrays_should_return_false() {
        assertFalse(monotonicArray.isMonotonic(new int[]{0, 1, 2, 3, 1}));
        assertFalse(monotonicArray.isMonotonic(new int[]{1, 2, 1}));
    }

    @Test
    public void monotonic_increasing_arrays_should_return_true() {
        assertTrue(monotonicArray.isMonotonic(new int[]{0}));
        assertTrue(monotonicArray.isMonotonic(new int[]{0, 1, 2}));
        assertTrue(monotonicArray.isMonotonic(new int[]{0, 3, 5}));
        assertTrue(monotonicArray.isMonotonic(new int[]{-5, 0, 5}));
        assertTrue(monotonicArray.isMonotonic(new int[]{0, 0, 0}));
        assertTrue(monotonicArray.isMonotonic(new int[]{1, 2, 4, 5}));

    }

    @Test
    public void monotonic_decreasing_arrays_should_return_true() {
        assertTrue(monotonicArray.isMonotonic(new int[]{0}));
        assertTrue(monotonicArray.isMonotonic(new int[]{2, 1, 0}));
        assertTrue(monotonicArray.isMonotonic(new int[]{5, 3, 1}));
        assertTrue(monotonicArray.isMonotonic(new int[]{5, 0, -5}));
        assertTrue(monotonicArray.isMonotonic(new int[]{-1, -2, -3}));
        assertTrue(monotonicArray.isMonotonic(new int[]{0, -1, -2, -3}));
        assertTrue(monotonicArray.isMonotonic(new int[]{0, 0, 0}));
        assertTrue(monotonicArray.isMonotonic(new int[]{6, 5, 4, 4}));
    }
}
