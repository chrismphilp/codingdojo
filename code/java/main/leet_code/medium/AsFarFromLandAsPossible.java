package leet_code.medium;

import java.util.LinkedList;
import java.util.Queue;

public class AsFarFromLandAsPossible {

    public int maxDistance(int[][] grid) {
        int max = -1;
        Queue<Node> q = createIslandQueue(grid);

        while (!q.isEmpty()) {

            int[] xDir = new int[]{0, 1, 0, -1};
            int[] yDir = new int[]{1, 0, -1, 0};

            Node curr = q.remove();

            for (int i = 0; i < 4; i++) {
                int x = curr.x + xDir[i];
                int y = curr.y + yDir[i];

                if (x >= 0 && x < grid.length && y >= 0 && y < grid.length) {
                    if (grid[x][y] == 0) {
                        max = Math.max(curr.steps + 1, max);
                        q.add(new Node(x, y, curr.steps + 1));
                        grid[x][y] = 2;
                    } else {
                        grid[x][y] = 2;
                    }
                }
            }
        }
        return max;
    }

    private Queue<Node> createIslandQueue(int[][] grid) {
        Queue<Node> q = new LinkedList<>();

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    q.add(new Node(i, j, 0));
                }
            }
        }
        return q;
    }
}

class Node {

    int x, y, steps;

    public Node(int x, int y, int steps) {
        this.x = x;
        this.y = y;
        this.steps = steps;
    }
}
