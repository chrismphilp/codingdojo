package leet_code.easy;

class RomanToInteger {
    public int romanToInt(String s) {
        int sum = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            switch (c) {
                case 'I': sum += (sum < 5) ? 1 : -1; break;
                case 'V': sum += (sum < 10) ? 5 : -5; break;
                case 'X': sum += (sum < 50) ? 10 : -10; break;
                case 'L': sum += (sum < 100) ? 50 : -50; break;
                case 'C': sum += (sum < 500) ? 100 : -100; break;
                case 'D': sum += (sum < 1000) ? 500 : -500; break;
                default: sum += (sum < 10000) ? 1000 : -1000;
            }
        }
        return sum;
    }
}