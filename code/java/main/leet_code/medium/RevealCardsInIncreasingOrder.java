package leet_code.medium;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class RevealCardsInIncreasingOrder {
    public int[] deckRevealedIncreasing(int[] deck) {
        Arrays.parallelSort(deck);
        int[] res = new int[deck.length];
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < deck.length; i++) {
            queue.add(i);
        }
        for (int i = 0; i < res.length; i++) {
            res[queue.poll()] = deck[i];
            queue.add(queue.poll());
        }
        return res;
    }
}
