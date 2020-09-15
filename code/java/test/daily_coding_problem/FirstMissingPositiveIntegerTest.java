package daily_coding_problem;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FirstMissingPositiveIntegerTest {

    FirstMissingPositiveInteger firstMissingPositiveInteger;

    @Before
    public void setup() {
        firstMissingPositiveInteger = new FirstMissingPositiveInteger();
    }

    @Test
    public void array_with_no_missing_positive_integer_should_return_negative_one() {
        assertEquals(1, firstMissingPositiveInteger.solution(new int[]{-1, -2, -3}));
    }

    @Test
    public void array_should_return_correct_missing_positive_integer() {
        assertEquals(1, firstMissingPositiveInteger.solution(new int[]{3, 4, 6}));
        assertEquals(2, firstMissingPositiveInteger.solution(new int[]{-1, -5, -4, -1, 1, 3}));
        assertEquals(2, firstMissingPositiveInteger.solution(new int[]{1, 4, 5}));
        assertEquals(3, firstMissingPositiveInteger.solution(new int[]{0, 1, 2}));
        assertEquals(3, firstMissingPositiveInteger.solution(new int[]{1, 2, 0}));
        assertEquals(4, firstMissingPositiveInteger.solution(new int[]{1, 2, 3}));
        assertEquals(1, firstMissingPositiveInteger.solution(new int[]{9, 10, 11}));
        assertEquals(2, firstMissingPositiveInteger.solution(new int[]{3, 4, 1, -1}));
        assertEquals(1, firstMissingPositiveInteger.solution(new int[]{7, 8, 9, 11, 12}));
        assertEquals(3, firstMissingPositiveInteger.solution(new int[]{-1, 4, 2, 1, 9, 10}));
        assertEquals(2, firstMissingPositiveInteger.solution(new int[]{1, 1}));
        assertEquals(2, firstMissingPositiveInteger.solution(new int[]{0, 1}));
        assertEquals(1, firstMissingPositiveInteger.solution(new int[]{0, 0}));
        assertEquals(2, firstMissingPositiveInteger.solution(new int[]{1}));
        assertEquals(1, firstMissingPositiveInteger.solution(new int[]{0}));
    }
}
