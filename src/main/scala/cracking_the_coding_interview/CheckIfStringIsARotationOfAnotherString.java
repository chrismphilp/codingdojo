package cracking_the_coding_interview;

public class CheckIfStringIsARotationOfAnotherString {
    public boolean calculate(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        if (s1.length() == 1) return true;

        char[] s1Chars = s1.toCharArray();
        char[] s2Chars = s2.toCharArray();

        for (int i = 0; i < s2Chars.length; i++) {
            int begin = 0;
            int curr = i;
            while (s2Chars[curr] == s1Chars[begin]) {
                if (curr == s1Chars.length - 1) {
                    return s2.substring(0, i).contains(s1.substring(begin + 1, s1Chars.length));
                }
                curr++;
                begin++;
            }
        }
        return false;
    }
}
