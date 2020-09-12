package leet_code.medium;

import java.util.Arrays;

public class SortTheMatrixDiagonally {
    public int[][] diagonalSort(int[][] mat) {
        if (mat.length == 1) return mat;
        int[] tmp = new int[mat.length * mat[0].length];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                tmp[i * (mat[0].length - 1) + j] = mat[i][j];
            }
        }

        Arrays.sort(tmp);

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = tmp[i * (mat[0].length - 1) + j];
            }
        }

        return mat;
    }
}
