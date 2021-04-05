package leet_code.medium;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class SortIntegersByThePowerValueTest {

    @InjectMocks
    private SortIntegersByThePowerValue sortIntegersByThePowerValue;

    @Test
    public void should_return_the_correct_array_for_example_one() {
        assertEquals(12, sortIntegersByThePowerValue.getKth(12, 15, 1));
        assertEquals(13, sortIntegersByThePowerValue.getKth(12, 15, 2));
        assertEquals(14, sortIntegersByThePowerValue.getKth(12, 15, 3));
        assertEquals(15, sortIntegersByThePowerValue.getKth(12, 15, 4));
    }

    @Test
    public void should_return_the_correct_array_for_example_two() {
        assertEquals(1, sortIntegersByThePowerValue.getKth(1, 1, 1));
        assertEquals(491, sortIntegersByThePowerValue.getKth(491, 491, 1));
    }

    @Test
    public void should_return_the_correct_array_for_example_three() {
        assertEquals(7, sortIntegersByThePowerValue.getKth(7, 11, 4));
    }

    @Test
    public void should_return_the_correct_array_for_example_four() {
        assertEquals(13, sortIntegersByThePowerValue.getKth(10, 20, 5));
    }

    @Test
    public void should_return_the_correct_array_for_example_five() {
        assertEquals(570, sortIntegersByThePowerValue.getKth(1, 1000, 777));
    }
}