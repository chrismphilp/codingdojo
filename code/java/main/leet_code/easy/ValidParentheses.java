package leet_code.easy;

import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        if (s.length() < 2) return false;
        Stack<Character> stackOfStrings = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char charAtI = s.charAt(i);

            if (charAtI == '(' || charAtI == '{' || charAtI == '[') {
                stackOfStrings.push(charAtI);
            } else {
                if (stackOfStrings.empty()) return false;
                char c = stackOfStrings.pop();
                if (c != getOpposite(charAtI)) return false;
            }
        }
        return stackOfStrings.empty();
    }

    private char getOpposite(char c) {
        switch (c) {
            case ')': return '(';
            case '}': return '{';
            default: return '[';
        }
    }
}
