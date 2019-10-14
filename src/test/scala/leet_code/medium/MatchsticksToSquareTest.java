package leet_code.medium;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MatchsticksToSquareTest {

    private MatchsticksToSquare matchsticksToSquare;

    @BeforeEach
    public void setup() {
        matchsticksToSquare = new MatchsticksToSquare();
    }

    @Test
    public void should_return_false_for_unsolvable_squares() {
        assertFalse(matchsticksToSquare.makesquare(new int[]{1, 1, 2, 3}));
        assertFalse(matchsticksToSquare.makesquare(new int[]{1, 1, 1, 2}));
        assertFalse(matchsticksToSquare.makesquare(new int[]{3, 3, 3, 3, 4}));
    }

    @Test
    public void should_return_true_for_solvable_squares() {
        assertTrue(matchsticksToSquare.makesquare(new int[]{1, 1, 2, 2, 4, 4, 4, 6}));
        assertTrue(matchsticksToSquare.makesquare(new int[]{1, 1, 1, 1}));
        assertTrue(matchsticksToSquare.makesquare(new int[]{1, 1, 2, 4, 4, 4, 5, 6, 9}));
        assertTrue(matchsticksToSquare.makesquare(new int[]{5, 5, 5, 5, 4, 4, 4, 4, 3, 3, 3, 3}));
    }
}
