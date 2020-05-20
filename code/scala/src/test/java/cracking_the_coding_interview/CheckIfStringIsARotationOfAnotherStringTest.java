package cracking_the_coding_interview;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CheckIfStringIsARotationOfAnotherStringTest {

    private CheckIfStringIsARotationOfAnotherString checkIfStringIsARotationOfAnotherString;

    @Before
    public void setup() {
        checkIfStringIsARotationOfAnotherString = new CheckIfStringIsARotationOfAnotherString();
    }

    @Test
    public void should_return_false_for_strings_with_different_lengths() {
        assertFalse(checkIfStringIsARotationOfAnotherString.calculate("test", "test1"));
    }

    @Test
    public void should_return_false_for_strings_with_mismatching_rotations() {
        assertFalse(checkIfStringIsARotationOfAnotherString.calculate("abcd", "abdc"));
        assertFalse(checkIfStringIsARotationOfAnotherString.calculate("talk", "lakt"));
        assertFalse(checkIfStringIsARotationOfAnotherString.calculate("to", "tt"));
    }

    @Test
    public void should_return_true_for_strings_with_matching_rotations() {
        assertTrue(checkIfStringIsARotationOfAnotherString.calculate("abcd", "cdab"));
        assertTrue(checkIfStringIsARotationOfAnotherString.calculate("abcde", "eabcd"));
        assertTrue(checkIfStringIsARotationOfAnotherString.calculate("yo", "oy"));
    }
}
