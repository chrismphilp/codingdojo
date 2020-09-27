package leet_code.easy;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ValidParenthesesTest {

    ValidParentheses validParentheses;

    @Before
    public void setup() {
        validParentheses = new ValidParentheses();
    }

    @Test
    public void single_item_string_should_return_false() {
        assertFalse(validParentheses.isValid("("));
    }

    @Test
    public void non_matching_parentheses_should_return_false() {
        assertFalse(validParentheses.isValid("(("));
        assertFalse(validParentheses.isValid("(}"));
        assertFalse(validParentheses.isValid("{{{}}}}"));
        assertFalse(validParentheses.isValid("[{([)}]"));
        assertFalse(validParentheses.isValid("[{}{}}]"));
    }

    @Test
    public void matching_parentheses_should_return_true() {
        assertTrue(validParentheses.isValid("()"));
        assertTrue(validParentheses.isValid("({})"));
        assertTrue(validParentheses.isValid("[({})]"));
        assertTrue(validParentheses.isValid("[[][]]"));
        assertTrue(validParentheses.isValid("[[]()[]]"));
    }
}
