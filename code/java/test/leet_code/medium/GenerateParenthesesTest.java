package leet_code.medium;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertTrue;

public class GenerateParenthesesTest {

    private GenerateParentheses generateParentheses;

    @Before
    public void setup() {
        generateParentheses = new GenerateParentheses();
    }

    @Test
    public void zero_input_should_return_single_element_empty_string_list() {
        assertTrue(generateParentheses.generateParenthesis(1).contains(""));
    }

    @Test
    public void one_input_should_return_single_element_matching_parentheses() {
        assertTrue(generateParentheses.generateParenthesis(1).contains("()"));
    }

    @Test
    public void two_input_should_return_single_element_matching_parentheses() {
        assertTrue(generateParentheses.generateParenthesis(2).containsAll(Arrays.asList(
                "()()",
                "(())"
        )));
    }

    @Test
    public void three_input_should_return_single_element_matching_parentheses() {
        assertTrue(generateParentheses.generateParenthesis(3).containsAll(Arrays.asList(
                "()()()",
                "(())()",
                "()(())",
                "(()())",
                "((()))"
        )));
    }
}
