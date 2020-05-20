package cracking_the_coding_interview;

import java.util.Arrays;

public class AllCharactersInStringAreUniqueWithoutDataStructures {
    public boolean calculate(String word) {
        char[] sortedLetters = word.toCharArray();
        Arrays.sort(sortedLetters);
        for (int i = 0; i < sortedLetters.length - 1; i++) {
            if (sortedLetters[i] == sortedLetters[i + 1]) return false;
        }
        return true;
    }
}
