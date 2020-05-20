package cracking_the_coding_interview;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PermutationsOfAStringInsideString {
    public List<String> calculate(String permutation, String fullLengthWord) {

        Map<Character, Integer> characterCount = new HashMap<>();
        List<String> listOfFoundPermutations = new ArrayList<>();

        for (int i = 0; i < permutation.length(); i++) {
            characterCount.compute(permutation.charAt(i), (k, v) -> (v == null) ? 1 : v + 1);
        }

        for (int i = 0; i < fullLengthWord.length(); i++) {
            Map<Character, Integer> characterCountCopy = new HashMap<>(characterCount);

            for (int j = i; i + permutation.length() <= fullLengthWord.length(); j++) {
                Character currentChar = fullLengthWord.charAt(j);

                if (characterCountCopy.containsKey(currentChar)) {
                    int currentCount = characterCountCopy.get(currentChar);
                    if (currentCount > 0) {
                        characterCountCopy.put(currentChar, currentCount - 1);
                        if (j - i == permutation.length() - 1) {
                            listOfFoundPermutations.add(fullLengthWord.substring(i, j + 1));
                            break;
                        }
                    }
                    else break;
                } else {
                    break;
                }
            }
        }
        return listOfFoundPermutations;
    }
}
