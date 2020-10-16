package leet_code.medium;

public class UniquePathsII {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int rows = obstacleGrid.length;
        int columns = obstacleGrid[0].length;

        if (obstacleGrid[0][0] == 1 || obstacleGrid[rows - 1][columns - 1] == 1) return 0;

        boolean found = false;
        for (int i = 0; i < rows; i++) {
            if (obstacleGrid[i][0] == 1) found = true;
            if (found) obstacleGrid[i][0] = -1;
            else obstacleGrid[i][0] = 1;
        }
        found = false;
        for (int i = 1; i < columns; i++) {
            if (obstacleGrid[0][i] == 1) found = true;
            if (found) obstacleGrid[0][i] = -1;
            else obstacleGrid[0][i] = 1;
        }

        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < columns; j++) {
                if (obstacleGrid[i][j] == 1) obstacleGrid[i][j] = -1;
                else {
                    int previousRow = obstacleGrid[i - 1][j];
                    int previousColumn = obstacleGrid[i][j - 1];

                    if (previousRow == -1 && previousColumn == -1) obstacleGrid[i][j] = -1;
                    else if (previousRow == -1) obstacleGrid[i][j] = previousColumn;
                    else if (previousColumn == -1) obstacleGrid[i][j] = previousRow;
                    else obstacleGrid[i][j] = previousRow + previousColumn;
                }
            }
        }
        return (obstacleGrid[rows - 1][columns - 1] == -1) ? 0 : obstacleGrid[rows - 1][columns - 1];
    }
}
