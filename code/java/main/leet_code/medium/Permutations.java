package leet_code.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Permutations {

    List<List<Integer>> store = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {
        if (nums.length == 0) return Collections.emptyList();
        if (nums.length == 1) return Collections.singletonList(Collections.singletonList(nums[0]));

        List<Integer> uniqueDigits = Arrays.stream(nums).boxed().collect(Collectors.toList());

        for (int i = 0; i < nums.length; i++) {
            List<Integer> tmp = new ArrayList<>(uniqueDigits);
            tmp.remove(i);
            createPermutations(Collections.singletonList(nums[i]), tmp);
        }
        return store;
    }

    private void createPermutations(List<Integer> curr, List<Integer> remaining) {
        if (remaining.size() == 0) {
            store.add(curr);
            return;
        }

        for (int i = 0; i < remaining.size(); i++) {
            List<Integer> tmpCurr = new ArrayList<>(curr);
            List<Integer> tmpRemaining = new ArrayList<>(remaining);
            tmpRemaining.remove(i);
            tmpCurr.add(remaining.get(i));
            createPermutations(tmpCurr, tmpRemaining);
        }
    }
}
