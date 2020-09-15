package cracking_the_coding_interview;

import java.util.HashSet;
import java.util.Set;

public class PrintAllPermutationsOfAString {
    public Set<String> calculate(String source) {
        if (source.length() == 0) return new HashSet<>();
        if (source.length() == 1) return new HashSet<String>() {{
            add(Character.toString(source.charAt(0)));
        }};

        Set<String> allVariations = new HashSet<>();
        allVariations.add(Character.toString(source.charAt(0)));

        for (int i = 1; i < source.length(); i++) {
            Character curr = source.charAt(i);
            Set<String> tempVariations = new HashSet<>();
            allVariations.forEach(variation -> processVariations(curr, variation, tempVariations));
            allVariations.addAll(tempVariations);
        }
        return allVariations;
    }

    private void processVariations(Character curr, String variation, Set<String> tempVariations) {
        for (int i = 0; i <= variation.length(); i++) {
            tempVariations.add(new StringBuilder(variation).insert(variation.length() - i, curr).toString());
        }
    }
}
