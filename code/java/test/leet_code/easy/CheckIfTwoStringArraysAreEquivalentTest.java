package leet_code.easy;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(MockitoExtension.class)
public class CheckIfTwoStringArraysAreEquivalentTest {

    @InjectMocks
    private CheckIfTwoStringArraysAreEquivalent checkIfTwoStringArraysAreEquivalent;

    @Test
    public void should_return_correct_result_for_example_one() {
        String[] word1 = new String[]{"ab", "c"};
        String[] word2 = new String[]{"a", "bc"};
        assertTrue(checkIfTwoStringArraysAreEquivalent.arrayStringsAreEqual(word1, word2));
    }

    @Test
    public void should_return_correct_result_for_example_two() {
        String[] word1 = new String[]{"a", "cb"};
        String[] word2 = new String[]{"ab", "c"};
        assertFalse(checkIfTwoStringArraysAreEquivalent.arrayStringsAreEqual(word1, word2));
    }

    @Test
    public void should_return_correct_result_for_example_three() {
        String[] word1 = new String[]{"abc", "d", "defg"};
        String[] word2 = new String[]{"abcddefg"};
        assertTrue(checkIfTwoStringArraysAreEquivalent.arrayStringsAreEqual(word1, word2));
    }
}