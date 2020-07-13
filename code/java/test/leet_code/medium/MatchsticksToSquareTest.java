package leet_code.medium;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MatchsticksToSquareTest {

    private MatchsticksToSquare matchsticksToSquare;

    @Before
    public void setup() {
        matchsticksToSquare = new MatchsticksToSquare();
    }

    @Test
    public void should_return_false_for_unsolvable_squares() {
        assertFalse(matchsticksToSquare.makeSquare(new int[]{1, 1, 2, 3}));
        assertFalse(matchsticksToSquare.makeSquare(new int[]{1, 1, 1, 2}));
        assertFalse(matchsticksToSquare.makeSquare(new int[]{3, 3, 3, 3, 4}));
    }

    @Test
    public void should_return_true_for_solvable_squares() {
        assertTrue(matchsticksToSquare.makeSquare(new int[]{1, 1, 2, 2, 4, 4, 4, 6}));
        assertTrue(matchsticksToSquare.makeSquare(new int[]{1, 1, 1, 1}));
        assertTrue(matchsticksToSquare.makeSquare(new int[]{1, 1, 2, 4, 4, 4, 5, 6, 9}));
    }
}
