package leet_code.medium;

import java.util.*;

public class LetterCombinationsOfAPhoneNumber {

    private final Map<Character, List<String>> phoneNumberMapping = new HashMap<Character, List<String>>() {{
        put('2', Arrays.asList("a", "b", "c"));
        put('3', Arrays.asList("d", "e", "f"));
        put('4', Arrays.asList("g", "h", "i"));
        put('5', Arrays.asList("j", "k", "l"));
        put('6', Arrays.asList("m", "n", "o"));
        put('7', Arrays.asList("p", "q", "r", "s"));
        put('8', Arrays.asList("t", "u", "v"));
        put('9', Arrays.asList("w", "x", "y", "z"));
    }};

    public List<String> letterCombinations(String digits) {
        LinkedList<String> fifo = new LinkedList<>();

        if (digits.length() == 1) {
            return phoneNumberMapping.get(digits.charAt(0));
        } else if (digits.length() > 1) {
            fifo.add("");

            for (int i = 0; i < digits.length(); i++) {
                List<String> digitValues = phoneNumberMapping.get(digits.charAt(i));

                while (fifo.peek().length() == i) {
                    String t = fifo.pop();
                    for (String v : digitValues) {
                        fifo.add(t + v);
                    }
                }
            }
        }
        return fifo;
    }
}
