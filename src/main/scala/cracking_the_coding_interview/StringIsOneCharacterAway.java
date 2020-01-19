package cracking_the_coding_interview;

public class StringIsOneCharacterAway {
    public boolean calculate(String originalWord, String comparisonWord) {
        char[] originalWordChars = originalWord.toCharArray();
        char[] comparisonWordChars = comparisonWord.toCharArray();

        if (Math.abs(originalWordChars.length - comparisonWordChars.length) > 1) return false;
        return processCharArrays(originalWordChars, comparisonWordChars);
    }

    private boolean processCharArrays(char[] a, char[] b) {
        boolean found = false;
        int x = 0;
        int y = 0;

        while (x < a.length && y < b.length) {
            if (a[x] != b[y]) {
                if (found) return false;
                if (a.length != b.length) {
                    if (a.length > b.length) {
                        x++;
                    } else {
                        y++;
                    }
                    found = true;
                } else {
                    found = true;
                    x++;
                    y++;
                }
            } else {
                x++;
                y++;
            }
        }
        return true;
    }
}
