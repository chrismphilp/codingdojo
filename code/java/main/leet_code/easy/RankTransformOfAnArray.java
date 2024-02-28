package leet_code.easy;

import java.util.Arrays;
import java.util.HashMap;

public class RankTransformOfAnArray {

    public int[] arrayRankTransform(int[] arr) {
        // [3, 2, 5, 4, 5] arr
        // [2, 3, 4, 5, 5] sort
        // [2, 1, 4, 3, 4] rank

        int[] sortedArr = Arrays.copyOf(arr, arr.length);
        Arrays.sort(sortedArr);

        HashMap<Integer, Integer> seen = new HashMap<>();

        for (int j : sortedArr) {
            seen.putIfAbsent(j, seen.size() + 1);
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = seen.get(arr[i]);
        }
        return arr;
    }
}
