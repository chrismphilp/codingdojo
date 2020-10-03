package leet_code.medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Permutations {

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> permutations = new ArrayList<>();
        if (nums.length == 0) return permutations;
        createPermutations(nums, 0, new ArrayList<>(), permutations);
        return permutations;
    }

    private void createPermutations(int[] nums, int curr, List<Integer> remaining,
                                    List<List<Integer>> permutations) {
        if (remaining.size() == nums.length) {
            permutations.add(remaining);
            return;
        }

        for (int i = 0; i <= remaining.size(); i++) {
            List<Integer> tmp = new ArrayList<>(remaining);
            tmp.add(i, nums[curr]);
            createPermutations(nums, curr + 1, tmp, permutations);
        }
    }
}
