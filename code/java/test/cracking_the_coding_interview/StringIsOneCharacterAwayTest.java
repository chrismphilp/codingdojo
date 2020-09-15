package cracking_the_coding_interview;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringIsOneCharacterAwayTest {

    private StringIsOneCharacterAway stringIsOneCharacterAway;

    @Before
    public void setup() {
        stringIsOneCharacterAway = new StringIsOneCharacterAway();
    }

    @Test
    public void should_return_true_for_strings_that_are_one_character_away() {
        assertTrue(stringIsOneCharacterAway.calculate("test", "testy"));
        assertTrue(stringIsOneCharacterAway.calculate("test", "tesd"));
        assertTrue(stringIsOneCharacterAway.calculate("ytest", "test"));
        assertTrue(stringIsOneCharacterAway.calculate("", "c"));
    }

    @Test
    public void should_return_false_for_strings_that_are_not_one_character_away() {
        assertFalse(stringIsOneCharacterAway.calculate("test", "ttes"));
        assertFalse(stringIsOneCharacterAway.calculate("blood", "borod"));
        assertFalse(stringIsOneCharacterAway.calculate("abc", "cba"));
        assertFalse(stringIsOneCharacterAway.calculate("b", "abc"));
        assertFalse(stringIsOneCharacterAway.calculate("", "cc"));
    }
}
