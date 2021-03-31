package leet_code.medium;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LetterTilePossibilitiesTest {

    private LetterTilePossibilities letterTilePossibilities;

    @Before
    public void setup() {
        letterTilePossibilities = new LetterTilePossibilities();
    }

    @Test
    public void should_return_correct_result_for_example_one() {
        assertEquals(8, letterTilePossibilities.numTilePossibilities("AAB"));
    }

    @Test
    public void should_return_correct_result_for_example_two() {
        assertEquals(188, letterTilePossibilities.numTilePossibilities("AAABBC"));
    }

    @Test
    public void should_return_correct_result_for_example_three() {
        assertEquals(1, letterTilePossibilities.numTilePossibilities("V"));
    }

    @Test
    public void should_return_correct_result_for_longest_input() {
        assertEquals(13699, letterTilePossibilities.numTilePossibilities("ABCDEFG"));
    }
}