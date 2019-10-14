package leet_code.medium;

import java.util.*;

//todo
public class MatchsticksToSquare {

    private int[] sums;
    private int[] nums;
    private int targetValue;

    public MatchsticksToSquare() {
        this.sums = new int[4];
    }

    public boolean makesquare(int[] nums) {

        if (nums == null || nums.length < 4) return false;

        Map<Integer, Integer> numberMap = new HashMap<>();
        Arrays.sort(nums);
        this.nums = nums;

        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            int currentValue = nums[i];
            sum += currentValue;
            if (numberMap.containsKey(currentValue)) numberMap.put(currentValue, numberMap.get(currentValue) + 1);
            else numberMap.put(currentValue, 1);
        }

        if ((sum % 4) != 0) return false;
        targetValue = sum / 4;

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
