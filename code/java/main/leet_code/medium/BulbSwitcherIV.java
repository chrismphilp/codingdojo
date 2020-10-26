package leet_code.medium;

public class BulbSwitcherIV {
    public int minFlips(String target) {
        int flips = 0;
        char curr = '0';

        for (int i = 0; i < target.length(); i++) {
            char c = target.charAt(i);
            if (curr != c) {
                curr =  c;
                flips++;
            }
        }
        return flips;
    }
}
