package leet_code.medium;

// TODO: Improve brute-force
public class MatrixBlockSum {
    public int[][] matrixBlockSum(int[][] mat, int K) {
        int[][] store = new int[mat.length][mat[0].length];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                int lowerR = i - K;
                int upperR = i + K;
                int lowerC = j - K;
                int upperC = j + K;

                int sum = 0;
                for (int k = Math.min(mat.length - 1, Math.max(lowerR, 0)); k <= Math.min(upperR, mat.length - 1); k++) {
                    for (int l = Math.min(mat[0].length - 1, Math.max(lowerC, 0)); l <= Math.min(upperC, mat[0].length - 1); l++) {
                        sum += mat[k][l];
                    }
                }
                store[i][j] = sum;
            }
        }
        return store;
    }
}
