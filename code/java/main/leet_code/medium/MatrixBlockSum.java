package leet_code.medium;

public class MatrixBlockSum {

    public int[][] matrixBlockSum(int[][] mat, int K) {
        int m = mat.length;
        int n = mat[0].length;
        int[][] partialSum = new int[m + 1][n + 1];
        int[][] res = new int[m][n];

        for (int i = 1; i < m + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                partialSum[i][j] = partialSum[i - 1][j] + partialSum[i][j - 1] + mat[i - 1][j - 1] - partialSum[i - 1][j - 1];
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int r1 = Math.max(0, i - K) + 1;
                int c1 = Math.max(0, j - K) + 1;
                int r2 = Math.min(m, i + K + 1);
                int c2 = Math.min(n, j + K + 1);
                res[i][j] = partialSum[r2][c2] - partialSum[r1 - 1][c2] - partialSum[r2][c1 - 1] + partialSum[r1 - 1][c1  - 1];
            }
        }
        return res;
    }
}
