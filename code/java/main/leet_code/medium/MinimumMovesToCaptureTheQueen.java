package leet_code.medium;

public class MinimumMovesToCaptureTheQueen {

    public int minMovesToCaptureTheQueen(int a, int b, int c, int d, int e, int f) {
        if (isRookInRangeOfQueen(e, f, c, d, a, b)) {
            return 1;
        } else if (isBishopInRangeOfQueen(e, f, c, d, a, b)) {
            return 1;
        } else {
            return 2;
        }
    }

    private boolean isRookInRangeOfQueen(int queenX, int queenY, int bishopX, int bishopY, int rookX, int rookY) {

        // Horizontal and vertical directions
        int[][] directions = new int[][]{{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

        for (int[] direction : directions) {
            for (int i = 1; i <= 8; i++) {
                // 1) Ensure bishop is not in the way
                // 2) Ensure queen can reach the rook using a vertical or horizontal direction
                int currX = (i * direction[0]) + rookX;
                int currY = (i * direction[1]) + rookY;

                if (currX == bishopX && currY == bishopY) {
                    break;
                } else if (currX == queenX && currY == queenY) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean isBishopInRangeOfQueen(int queenX, int queenY, int bishopX, int bishopY, int rookX, int rookY) {
        // Diagonal directions
        int[][] directions = new int[][]{{1, 1}, {1, -1}, {-1, 1}, {-1, -1}};

        for (int[] direction : directions) {
            for (int i = 1; i <= 8; i++) {
                // 1) Ensure rook is not in the way
                // 2) Ensure queen can reach the rook using a vertical or horizontal direction
                int currX = (i * direction[0]) + bishopX;
                int currY = (i * direction[1]) + bishopY;

                if (currX == rookX && currY == rookY) {
                    break;
                } else if (currX == queenX && currY == queenY) {
                    return true;
                }
            }
        }
        return false;
    }
}
