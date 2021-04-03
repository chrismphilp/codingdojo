package leet_code.medium;

import java.util.Arrays;

// TODO: Finish
public class RevealCardsInIncreasingOrder {
    public int[] deckRevealedIncreasing(int[] deck) {
        Arrays.parallelSort(deck);
        int[] res = new int[deck.length];
        res[res.length - 1] = deck[deck.length - 1];

        for (int i = deck.length - 2; i >= 1; i--) {
            // swap the front and last element
            int tmp = res[i];
            res[i] = res[res.length - 1];
            res[res.length - 1] = tmp;
            // add next element to the front
            res[i - 1] = deck[i - 1];
        }
        return res;
    }
}
