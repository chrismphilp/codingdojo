package leet_code.medium;

public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        int[][][] boardMapper = new int[3][9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') continue;
                int num = board[i][j] - '1';

                if (boardMapper[0][i][num] > 0) return false;
                else boardMapper[0][i][num] = 1;

                if (boardMapper[1][j][num] > 0) return false;
                else boardMapper[1][j][num] = 1;

                int s = (i / 3) * 3 + j / 3;

                if (boardMapper[2][s][num] > 0) return false;
                else boardMapper[2][s][num] = 1;
            }
        }
        return true;
    }
}
