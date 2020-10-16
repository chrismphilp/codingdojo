package leet_code.medium;

public class UniquePathsI {
    public int uniquePaths(int m, int n) {
        if (m == 1 || n == 1) return 1;
        int[][] gridMemo = new int[m][n];
        for (int i = 0; i < m; i++) gridMemo[i][0] = 1;
        for (int i = 0; i < n; i++) gridMemo[0][i] = 1;

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                gridMemo[i][j] = gridMemo[i - 1][j] + gridMemo[i][j - 1];
            }
        }
        return gridMemo[m - 1][n - 1];
    }
}
