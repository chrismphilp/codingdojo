package leet_code.medium;

import java.util.Arrays;

public class SortTheMatrixDiagonally {
    public int[][] diagonalSort(int[][] mat) {
        if (mat.length == 1) return mat;
        int[] tmp = new int[mat.length * mat[0].length];

        for (int i = 0; i < mat.length; i++) {
            System.arraycopy(mat[i], 0, tmp, i * (mat[0].length - 1), mat[i].length);
        }

        Arrays.sort(tmp);

        for (int i = 0; i < mat.length; i++) {
            System.arraycopy(tmp, i * (mat[0].length - 1), mat[i], 0, mat[i].length);
        }

        return mat;
    }
}
