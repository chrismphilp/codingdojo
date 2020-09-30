package leet_code.medium;

import java.util.*;

public class MultiplyStrings {

    private final Map<Character, Integer> digitMap = new HashMap<Character, Integer>() {{
        put('0', 0);
        put('1', 1);
        put('2', 2);
        put('3', 3);
        put('4', 4);
        put('5', 5);
        put('6', 6);
        put('7', 7);
        put('8', 8);
        put('9', 9);
    }};

    public String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) return "0";

        int num1Index = num1.length() - 1;
        int[] total = new int[num1.length() + num2.length() - 1];

        while (num1Index >= 0) {
            char c1 = num1.charAt(num1Index);
            int c1Value = digitMap.get(c1);

            for (int i = num2.length() - 1; i >= 0; i--) {
                char c2 = num2.charAt(i);
                int c2Value = digitMap.get(c2);
                total[num1Index + i] += c1Value * c2Value;
            }
            num1Index--;
        }

        StringBuilder sb = new StringBuilder();

        for (int i = total.length - 1; i >= 1; i--) {
            total[i - 1] += total[i] / 10;
            int lastPart = total[i] % 10;
            sb.append(lastPart);
        }
        while (total[0] > 0) {
            int lastPart = total[0] % 10;
            total[0] = total[0] / 10;
            sb.append(lastPart);
        }
        return sb.reverse().toString();
    }
}
