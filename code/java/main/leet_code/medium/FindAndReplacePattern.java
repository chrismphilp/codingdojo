package leet_code.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindAndReplacePattern {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> validWords = new ArrayList<>();
        int patternLength = pattern.length();

        for (String word : words) {

            Map<Character, Character> characterMapping = new HashMap<>();
            Map<Character, Character> reverseCharacterMapping = new HashMap<>();
            boolean shouldAdd = true;

            for (int j = 0; j < patternLength; j++) {
                char c = word.charAt(j);
                char p = pattern.charAt(j);

                if ((characterMapping.containsKey(p) && characterMapping.get(p) != c)
                        || (reverseCharacterMapping.containsKey(c) && reverseCharacterMapping.get(c) != p)) {
                    shouldAdd = false;
                    break;
                } else {
                    characterMapping.put(p, c);
                    reverseCharacterMapping.put(c, p);
                }
            }
            if (shouldAdd) validWords.add(word);
        }
        return validWords;
    }
}
