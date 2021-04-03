package leet_code.medium;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

@ExtendWith(MockitoExtension.class)
class MinimumNumberOfOperationsToMoveAllBallsToEachBoxTest {

    @InjectMocks
    private MinimumNumberOfOperationsToMoveAllBallsToEachBox testedClass;

    @Test
    public void should_return_correct_result_for_example_one() {
        assertArrayEquals(new int[]{1, 1, 3}, testedClass.minOperations("110"));
    }

    @Test
    public void should_return_correct_result_for_example_two() {
        assertArrayEquals(new int[]{11, 8, 5, 4, 3, 4}, testedClass.minOperations("001011"));
    }
}