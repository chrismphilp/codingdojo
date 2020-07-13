package leet_code.easy;

class RomanToInteger {
    public int romanToInt(String s) {
        int sum = 0;

        for (int i = 0; i < s.length(); i++) {
            if (i + 1 != s.length()) {
                char a = s.charAt(i);
                char b = s.charAt(i + 1);
                int aValue = convertSingleRomanNumeral(a);
                int bValue = convertSingleRomanNumeral(b);

                if (aValue < bValue) {
                    sum += (bValue - aValue);
                    i++;
                } else {
                    sum += aValue;
                }
            } else {
                sum += convertSingleRomanNumeral(s.charAt(i));
            }
        }
        return sum;
    }

    private int convertSingleRomanNumeral(char c) {
        switch (c) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            default: return 1000;
        }
    }
}