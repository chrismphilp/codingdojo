package leet_code.medium;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class SortTheMatrixDiagonally {

    public int[][] diagonalSort(int[][] mat) {

        Map<Integer, Queue<Integer>> store = new HashMap<>();

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                Queue<Integer> queue = store.getOrDefault(i - j, new PriorityQueue<>());
                queue.add(mat[i][j]);
                store.put(i - j, queue);
            }
        }

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = store.get(i - j).remove();
            }
        }

        return mat;
    }
}
