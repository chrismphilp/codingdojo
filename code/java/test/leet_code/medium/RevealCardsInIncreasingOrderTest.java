package leet_code.medium;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

// TODO: Finish
public class RevealCardsInIncreasingOrderTest {

    private RevealCardsInIncreasingOrder revealCardsInIncreasingOrder;

    @Before
    public void setUp() {
        revealCardsInIncreasingOrder = new RevealCardsInIncreasingOrder();
    }

    @Test
    public void should_return_the_correct_array_for_example_one() {
        int[] res = revealCardsInIncreasingOrder.deckRevealedIncreasing(new int[]{17, 13, 11, 2, 3, 5, 7});
//        assertArrayEquals(new int[]{2, 13, 3, 11, 5, 17, 7}, res);
    }
}