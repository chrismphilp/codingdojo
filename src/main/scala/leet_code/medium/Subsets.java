package leet_code.medium;

import java.util.*;

public class Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> powerset = new ArrayList<>();
        powerset.add(new ArrayList<>());

        for (int value : nums) {
            final int currentSize = powerset.size();

            for (int j = 0; j < currentSize; j++) {
                List<Integer> item = powerset.get(j);

                List<Integer> copy = new ArrayList<>(item);
                copy.add(value);
                powerset.add(copy);
            }
        }
        return new ArrayList<>(powerset);
    }
}
