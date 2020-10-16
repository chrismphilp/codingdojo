package leet_code.medium;

public class UniquePathsII {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int rows = obstacleGrid.length;
        int columns = obstacleGrid[0].length;
        if (obstacleGrid[0][0] == 1 || obstacleGrid[rows - 1][columns - 1] == 1) return 0;

        int[][] grid = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            if (obstacleGrid[i][0] == 1) break;
            else grid[i][0] = 1;
        }
        for (int i = 1; i < columns; i++) {
            if (obstacleGrid[0][i] == 1) break;
            else grid[0][i] = 1;
        }

        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < columns; j++) {
                if (obstacleGrid[i][j] == 1) grid[i][j] = 0;
                else grid[i][j] = grid[i - 1][j] + grid[i][j - 1];
            }
        }
        return grid[rows - 1][columns - 1];
    }
}
