package interview;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {
    public int findFirstNonRepeatingCharacter(int[] listOfCharacters) {
        Map<Integer, Boolean> currentOccurrences = new HashMap<>();

        for (int i = 0; i < listOfCharacters.length; i++) {
            int currentChar = listOfCharacters[i];
            if (currentOccurrences.containsKey(currentChar) && currentOccurrences.get(currentChar)) {
                currentOccurrences.put(currentChar, false);
            } else if (!currentOccurrences.containsKey(currentChar)) currentOccurrences.put(currentChar, true);
        }

        for (int i = 0; i < listOfCharacters.length; i++) {
            int currentChar = listOfCharacters[i];
            if (currentOccurrences.get(currentChar)) return currentChar;
        }
        return Integer.MAX_VALUE;
    }
}
