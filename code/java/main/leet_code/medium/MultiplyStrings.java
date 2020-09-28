package leet_code.medium;

import java.util.*;

// TODO: Improve performance
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
        List<String> currentTotals = new ArrayList<>();
        int maxLength = 0;
        StringBuilder sb;
        int carryOver = 0;

        while (num1Index >= 0) {
            char c1 = num1.charAt(num1Index);
            int c1Value = digitMap.get(c1);

            sb = new StringBuilder();
            sb.append(String.join("", Collections.nCopies(num1.length() - 1 - num1Index, "0")));

            for (int i = num2.length() - 1; i >= 0; i--) {
                char c2 = num2.charAt(i);
                int c2Value = digitMap.get(c2);
                int multiplication = c1Value * c2Value + carryOver;
                carryOver = multiplication / 10;
                int lastPart = multiplication % 10;
                sb.append(lastPart);
            }
            while (carryOver != 0) {
                sb.append(carryOver % 10);
                carryOver = carryOver / 10;
            }
            if (sb.length() > maxLength) maxLength = sb.length();
            currentTotals.add(sb.toString());
            num1Index--;
        }
        return addListOfStringNumbers(currentTotals, maxLength);
    }

    public String addListOfStringNumbers(List<String> numbers, int maxLength) {
        StringBuilder sb = new StringBuilder();
        int currentIndex = 0;
        int total = 0;
        int carryOver = 0;

        while (currentIndex != maxLength) {
            for (int i = 0; i < numbers.size(); i++) {
                String s = numbers.get(i);
                if (currentIndex < s.length()) {
                    total += digitMap.get(s.charAt(currentIndex));
                }
                currentIndex++;
            }
            sb.append(total % 10);
            carryOver = total / 10;
            total = 0;
        }

        while (carryOver != 0) {
            sb.append(carryOver % 10);
            carryOver = carryOver / 10;
        }
        return sb.reverse().toString();
    }
}
