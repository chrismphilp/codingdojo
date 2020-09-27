package leet_code.medium;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GenerateParenthesesTest {

    private GenerateParentheses generateParentheses;

    @Before
    public void setup() {
        generateParentheses = new GenerateParentheses();
    }

    @Test
    public void zero_input_should_return_single_element_empty_string_list() {
        List<String> list = generateParentheses.generateParenthesis(0);
        assertTrue(list.contains(""));
        assertEquals(1, list.size());
    }

    @Test
    public void one_input_should_return_single_element_matching_parentheses() {
        List<String> list = generateParentheses.generateParenthesis(1);
        assertTrue(list.contains("()"));
        assertEquals(1, list.size());
    }

    @Test
    public void two_input_should_return_single_element_matching_parentheses() {
        List<String> list = generateParentheses.generateParenthesis(2);
        assertTrue(list.contains("()()"));
        assertTrue(list.contains("(())"));
        assertEquals(2, list.size());
    }

    @Test
    public void three_input_should_return_single_element_matching_parentheses() {
        List<String> list = generateParentheses.generateParenthesis(3);
        assertTrue(list.contains("()()()"));
        assertTrue(list.contains("(())()"));
        assertTrue(list.contains("()(())"));
        assertTrue(list.contains("(()())"));
        assertTrue(list.contains("((()))"));
        assertEquals(5, list.size());
    }
}
