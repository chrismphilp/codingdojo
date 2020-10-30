package leet_code.medium;

public class MinimumAddToMakeParenthesesValid {
    public int minAddToMakeValid(String S) {
        int openBrackets = 0;
        int numberOfBrackets = 0;

        for (int i = 0; i < S.length(); i++) {
            char s = S.charAt(i);
            if (s == '(') openBrackets++;
            else {
                if (openBrackets > 0) openBrackets--;
                else numberOfBrackets++;
            }
        }
        return numberOfBrackets + openBrackets;
    }
}
