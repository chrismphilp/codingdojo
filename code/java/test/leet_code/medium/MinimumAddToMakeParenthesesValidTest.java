package leet_code.medium;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MinimumAddToMakeParenthesesValidTest {

    private MinimumAddToMakeParenthesesValid minimumAddToMakeParenthesesValid;

    @Before
    public void setup() {
        minimumAddToMakeParenthesesValid = new MinimumAddToMakeParenthesesValid();
    }

    @Test
    public void should_return_correct_result_for_example_one() {
        assertEquals(1, minimumAddToMakeParenthesesValid.minAddToMakeValid("())"));
    }

    @Test
    public void should_return_correct_result_for_example_two() {
        assertEquals(3, minimumAddToMakeParenthesesValid.minAddToMakeValid("((("));
    }

    @Test
    public void should_return_correct_result_for_example_three() {
        assertEquals(0, minimumAddToMakeParenthesesValid.minAddToMakeValid("()"));
    }

    @Test
    public void should_return_correct_result_for_example_four() {
        assertEquals(4, minimumAddToMakeParenthesesValid.minAddToMakeValid("()))(("));
    }

    @Test
    public void should_return_correct_result_for_all_non_matching_brackets() {
        assertEquals(6, minimumAddToMakeParenthesesValid.minAddToMakeValid(")))((("));
    }

    @Test
    public void should_return_correct_result_for_all_matching_brackets() {
        assertEquals(0, minimumAddToMakeParenthesesValid.minAddToMakeValid("((((()()))))"));
    }
}
