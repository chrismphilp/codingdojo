package leet_code.medium;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class IsWordValidAfterSubstitutionsTest {

    private IsWordValidAfterSubstitutions isWordValidAfterSubstitutions;

    @Before
    public void setup() {
        isWordValidAfterSubstitutions = new IsWordValidAfterSubstitutions();
    }

    @Test
    public void should_return_true_for_words_with_correct_substitutions() {
        assertTrue(isWordValidAfterSubstitutions.isValid("abc"));
        assertTrue(isWordValidAfterSubstitutions.isValid("aabcbc"));
        assertTrue(isWordValidAfterSubstitutions.isValid("abcabc"));
        assertTrue(isWordValidAfterSubstitutions.isValid("aabcbabcc"));
        assertTrue(isWordValidAfterSubstitutions.isValid("abcabcababcc"));
    }

    @Test
    public void should_return_false_for_words_with_incorrect_substitutions() {
        assertFalse(isWordValidAfterSubstitutions.isValid(""));
        assertFalse(isWordValidAfterSubstitutions.isValid("acb"));
        assertFalse(isWordValidAfterSubstitutions.isValid("abcbabc"));
    }
}
