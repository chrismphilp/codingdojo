package leet_code.medium;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.Assert.assertArrayEquals;

@ExtendWith(MockitoExtension.class)
public class RevealCardsInIncreasingOrderTest {

    @InjectMocks
    private RevealCardsInIncreasingOrder revealCardsInIncreasingOrder;

    @Test
    public void should_return_the_correct_array_for_example_one() {
        int[] res = revealCardsInIncreasingOrder.deckRevealedIncreasing(new int[]{17, 13, 11, 2, 3, 5, 7});
        // Sorted values 2, 3, 5, 7, 11, 13, 17
        assertArrayEquals(new int[]{2, 13, 3, 11, 5, 17, 7}, res);
    }

    @Test
    public void should_return_the_correct_array_for_numerical_increasing() {
        int[] res = revealCardsInIncreasingOrder.deckRevealedIncreasing(new int[]{1, 2, 3, 4, 5, 6, 7});
        assertArrayEquals(new int[]{1, 6, 2, 5, 3, 7, 4}, res);
    }
}