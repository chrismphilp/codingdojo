package leet_code.medium;

import java.util.*;
import java.util.stream.Collectors;

public class PermutationsII {

    public List<List<Integer>> permuteUnique(int[] nums) {
        if (nums.length == 0) return Collections.emptyList();
        Set<List<Integer>> permutations = new HashSet<>();
        createPermutations(Collections.emptyList(), Arrays.stream(nums).boxed().collect(Collectors.toList()), permutations);
        return new ArrayList<>(permutations);
    }

    private void createPermutations(List<Integer> curr, List<Integer> remaining, Set<List<Integer>> permutations) {

        if (remaining.isEmpty()) {
            permutations.add(curr);
            return;
        }

        for (int i = 0; i < remaining.size(); i++) {
            List<Integer> tmpRemaining = new ArrayList<>(remaining);
            Integer s = tmpRemaining.remove(i);
            List<Integer> tmpCurr = new ArrayList<>(curr);
            tmpCurr.add(s);
            createPermutations(tmpCurr, tmpRemaining, permutations);
        }
    }
}
