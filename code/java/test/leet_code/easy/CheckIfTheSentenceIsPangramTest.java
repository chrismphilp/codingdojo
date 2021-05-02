package leet_code.easy;

import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(MockitoExtension.class)
public class CheckIfTheSentenceIsPangramTest {

    @InjectMocks
    private CheckIfTheSentenceIsPangram checkIfTheSentenceIsPangram;

    public void should_return_correct_result_for_example_one() {
        assertTrue(checkIfTheSentenceIsPangram.checkIfPangram("thequickbrownfoxjumpsoverthelazydog"));
    }

    public void should_return_correct_result_for_example_two() {
        assertFalse(checkIfTheSentenceIsPangram.checkIfPangram("leetcode"));
    }
}