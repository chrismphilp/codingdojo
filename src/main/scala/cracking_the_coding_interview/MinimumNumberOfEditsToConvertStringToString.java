package cracking_the_coding_interview;

public class MinimumNumberOfEditsToConvertStringToString {
    public int calculate(char[] a, char[] b) {
        int[][] changeCostStore = new int[a.length + 1][b.length + 1];

        for (int i = 0; i <= a.length; i++) {
            for (int j = 0; j <= b.length; j++) {

                if (i == 0) changeCostStore[i][j] = j;
                else if (j == 0) changeCostStore[i][j] = i;
                else if (a[i - 1] == b[j - 1]) changeCostStore[i][j] = changeCostStore[i - 1][j - 1];
                else changeCostStore[i][j] = 1 + min(
                            changeCostStore[i][j - 1], // Insertion
                            changeCostStore[i - 1][j], // Removal
                            changeCostStore[i - 1][j - 1] //Replacement
                    );
            }
        }
        return changeCostStore[a.length][b.length];
    }

    private int min(int a, int b, int c) {
        return Math.min(Math.min(a, b), c);
    }
}
