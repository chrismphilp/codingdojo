package cracking_the_coding_interview;

public class ShortestPathToReachCellGrid {

    public int calculate(int width, int height) {
        if (width == 0 || height == 0) return 0;
        int[][] gridCost = new int[width + 1][height + 1];

        for (int i = 0; i <= width; i++) {
            for (int j = 0; j <= height; j++) {
                if (i == 0) gridCost[i][j] = j;
                else if (j == 0) gridCost[i][j] = i;
                else gridCost[i][j] = 1 + Math.min(gridCost[i - 1][j], gridCost[i][j - 1]);
            }
        }
        return gridCost[width][height];
    }
}
