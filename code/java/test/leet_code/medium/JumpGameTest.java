package leet_code.medium;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class JumpGameTest {

    private JumpGame jumpGame;

    @Before
    public void setup() {
        jumpGame = new JumpGame();
    }

    @Test
    public void should_return_correct_result_for_single_element_array() {
        assertTrue(jumpGame.canJump(new int[]{0}));
        assertTrue(jumpGame.canJump(new int[]{5}));
    }

    @Test
    public void should_return_correct_result_for_multiple_element_array() {
        assertTrue(jumpGame.canJump(new int[]{2, 3, 1, 1, 4}));
        assertTrue(jumpGame.canJump(new int[]{2, 1, 2, 0, 1}));
        assertTrue(jumpGame.canJump(new int[]{3, 0, 0, 1, 1}));
        assertFalse(jumpGame.canJump(new int[]{3, 2, 1, 0, 4}));
        assertFalse(jumpGame.canJump(new int[]{3, 0, 0, 0, 1}));
        assertFalse(jumpGame.canJump(new int[]{2, 1, 2, 0, 1, 1, 1, 2, 0, 1, 0, 0}));
    }
}
