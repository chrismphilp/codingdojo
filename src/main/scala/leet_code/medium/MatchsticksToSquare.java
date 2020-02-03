package leet_code.medium;

import java.util.*;

// TODO
public class MatchsticksToSquare {

    public MatchsticksToSquare() {
        int[] sums = new int[4];
    }

    public boolean makeSquare(int[] nums) {

        if (nums == null || nums.length < 4) return false;

        Map<Integer, Integer> numberMap = new HashMap<>();
        Arrays.sort(nums);

        int sum = 0;

        for (int currentValue : nums) {
            sum += currentValue;
            if (numberMap.containsKey(currentValue)) numberMap.put(currentValue, numberMap.get(currentValue) + 1);
            else numberMap.put(currentValue, 1);
        }

        if ((sum % 4) != 0) return false;
        int targetValue = sum / 4;

        for (int x = 0; x < 4; x++) {

            boolean found = false;
            int currentValue = targetValue;

            for (int i = nums.length - 1; i >= 0; i--) {
                if (numberMap.containsKey(nums[i]) && numberMap.get(nums[i]) > 0 && currentValue >= nums[i]) {
                    currentValue -= nums[i];
                    numberMap.put(nums[i], numberMap.get(nums[i]) - 1);
                }
                if (currentValue == 0) {
                    found = true;
                    break;
                }
            }
            if (!found) return false;
        }
        return true;
    }
}
