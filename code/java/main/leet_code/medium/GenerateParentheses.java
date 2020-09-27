package leet_code.medium;

import java.util.*;

public class GenerateParentheses {

    List<String> list = new ArrayList<>();

    public List<String> generateParenthesis(int n) {
        if (n == 0) return Collections.singletonList("");
        createParenthesesString("(", 1, 1, 0, n);
        return list;
    }

    private void createParenthesesString(String curr, int openBracketsUsed, int openBrackets, int closedBracketsUsed,
                                         int n) {
        if (closedBracketsUsed == n) {
            list.add(curr);
        } else if (openBracketsUsed == n) {
            createParenthesesString(curr.concat(")"), openBracketsUsed, openBrackets - 1,
                    closedBracketsUsed + 1, n);
        } else {
            if (openBracketsUsed < n) {
                createParenthesesString(curr.concat("("), openBracketsUsed + 1,
                        openBrackets + 1, closedBracketsUsed, n);
            }
            if (closedBracketsUsed < n && openBrackets > 0) {
                createParenthesesString(curr.concat(")"), openBracketsUsed, openBrackets - 1,
                        closedBracketsUsed + 1, n);
            }
        }
    }
}
