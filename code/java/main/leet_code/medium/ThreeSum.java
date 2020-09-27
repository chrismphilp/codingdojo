package leet_code.medium;

import java.util.*;

// TODO
public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> container = new ArrayList<>();
        Map<Integer, Integer> store = new HashMap<>();
        for (int num : nums) {
            store.computeIfAbsent(num, k -> store.put(num, 1));
            store.computeIfPresent(num, (k, v) -> store.put(num, v + 1));
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int total = nums[i] + nums[j];
                if (store.containsKey(-total)) {
                    List<Integer> val = Arrays.asList(nums[i], nums[j], -total);
                    if (container.contains(val)) container.add(Arrays.asList(nums[i], nums[j], -total));
                }
            }
        }
        return container;
    }
}
