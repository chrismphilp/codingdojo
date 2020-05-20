package leet_code.easy;

public class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0;
        int currentCount = 0;

        for (int num : nums) {
            if (num == 1) currentCount++;
            else currentCount = 0;

            if (currentCount > maxCount) maxCount = currentCount;
        }
        return maxCount;
    }
}
