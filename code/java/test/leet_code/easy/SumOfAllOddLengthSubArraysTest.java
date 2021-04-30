package leet_code.easy;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
class SumOfAllOddLengthSubArraysTest {

    @InjectMocks
    private SumOfAllOddLengthSubArrays sumOfAllOddLengthSubArrays;

    @Test
    public void should_return_correct_result_for_example_one() {
        assertEquals(58, sumOfAllOddLengthSubArrays.sumOddLengthSubArrays(new int[]{1, 4, 2, 5, 3}));
    }

    @Test
    public void should_return_correct_result_for_example_two() {
        assertEquals(3, sumOfAllOddLengthSubArrays.sumOddLengthSubArrays(new int[]{1, 2}));
    }

    @Test
    public void should_return_correct_result_for_example_three() {
        assertEquals(66, sumOfAllOddLengthSubArrays.sumOddLengthSubArrays(new int[]{10, 11, 12}));
    }
}