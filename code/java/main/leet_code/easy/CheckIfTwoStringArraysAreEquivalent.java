package leet_code.easy;

public class CheckIfTwoStringArraysAreEquivalent {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        int word1Index = 0, word1Pointer = 0;
        int word2Index = 0, word2Pointer = 0;

        while (word1Index < word1.length && word2Index < word2.length &&
                word1[word1Index].charAt(word1Pointer) == word2[word2Index].charAt(word2Pointer)) {
            if (word1[word1Index].length() - 1 == word1Pointer) {
                word1Index++;
                word1Pointer = 0;
            } else {
                word1Pointer++;
            }
            if (word2[word2Index].length() - 1 == word2Pointer) {
                word2Index++;
                word2Pointer = 0;
            } else {
                word2Pointer++;
            }
        }
        return word1.length <= word1Index && word2.length <= word2Index;
    }
}
