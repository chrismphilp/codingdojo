package leet_code.medium;

import java.util.Stack;

public class IsWordValidAfterSubstitutions {
    // Starting word is "abc"
    public boolean isValid(String S) {
        if (S.length() < 3) return false;

        Stack<Character> characterStack = new Stack<>();
        int index = 0;

        while (index < S.length()) {
            char current = S.charAt(index);

            if (current == 'c') {
                if (characterStack.size() < 2) return false;
                char secondLetter = characterStack.pop();
                char firstLetter = characterStack.pop();
                if (firstLetter != 'a' || secondLetter != 'b') return false;
            } else {
                characterStack.push(current);
            }
            index++;
        }
        return characterStack.isEmpty();
    }
}
