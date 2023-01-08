package leet_code.easy;

public class CheckIfTheSentenceIsPangram {
    public boolean checkIfPangram(String sentence) {
        int sum = 0;
        char[] values = new char[26];
        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);
            if (values[c - 97] == 0) {
                values[c - 97] = 1;
                sum++;
            }
            if (sum == 26) {
                return true;
            }
        }
        return false;
    }
}
