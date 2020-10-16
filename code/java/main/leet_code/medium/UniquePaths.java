package leet_code.medium;

// TODO: Improve speeds
public class UniquePaths {
    public int uniquePaths(int m, int n) {
        return remainingSteps(m, n, 1, 1);
    }

    private int remainingSteps(int gridX, int gridY, int currX, int currY) {
        if (currX == gridX && currY == gridY) return 1;
        else if (currX == gridX) return remainingSteps(gridX, gridY, currX, currY + 1);
        else if (currY == gridY) return remainingSteps(gridX, gridY, currX + 1, currY);
        else {
            return remainingSteps(gridX, gridY, currX + 1, currY) +
                    remainingSteps(gridX, gridY, currX, currY + 1);
        }
    }
}
