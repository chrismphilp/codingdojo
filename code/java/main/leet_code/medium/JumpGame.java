package leet_code.medium;

public class JumpGame {
    public boolean canJump(int[] nums) {
        if (nums.length <= 1) return true;
        int currentIndex = 0;
        int maxDistance = 0;

        while (currentIndex < nums.length && currentIndex <= maxDistance) {
            int distance = nums[currentIndex];
            if (maxDistance == nums.length - 1) return true;
            if ((currentIndex + distance) > maxDistance) {
                maxDistance = currentIndex + distance;
            }
            currentIndex++;
        }
        return maxDistance >= nums.length - 1;
    }
}
