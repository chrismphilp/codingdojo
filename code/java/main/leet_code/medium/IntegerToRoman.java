package leet_code.medium;

import java.util.Collections;

public class IntegerToRoman {
    public String intToRoman(int num) {
        StringBuilder roman = new StringBuilder();
        int currentDigit, count = 0;
        int tmp = num;

        while (tmp > 0) {
            currentDigit = tmp % 10;
            tmp = tmp / 10;

            if (currentDigit > 0 && currentDigit <= 3) {
                roman.append(String.join("", Collections.nCopies(currentDigit, getLevelBottom(count))));
            } else if (currentDigit == 4) {
                roman.append(getLevelMiddle(count)).append(getLevelBottom(count));
            } else if (currentDigit == 5) {
                roman.append(getLevelMiddle(count));
            } else if (currentDigit > 5 && currentDigit <= 8) {
                roman.append(String.join("", Collections.nCopies(currentDigit - 5, getLevelBottom(count)))).append(getLevelMiddle(count));
            } else if (currentDigit == 9) {
                roman.append(getLevelTop(count)).append(getLevelBottom(count));
            }
            count++;
        }
        return roman.reverse().toString();
    }

    private String getLevelBottom(int level) {
        switch (level) {
            case 0:
                return "I";
            case 1:
                return "X";
            case 2:
                return "C";
            default:
                return "M";
        }
    }

    private String getLevelMiddle(int level) {
        switch (level) {
            case 0:
                return "V";
            case 1:
                return "L";
            default:
                return "D";
        }
    }

    private String getLevelTop(int level) {
        switch (level) {
            case 0:
                return "X";
            case 1:
                return "C";
            default:
                return "M";
        }
    }
}
