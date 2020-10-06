package leet_code.medium;

public class FindFirstAndLastPositionOfElementInSortedArray {
    public int[] searchRange(int[] nums, int target) {
        int lower = findLowerBound(nums, target);
        int upper = findUpperBound(nums, target, lower);
        return new int[]{lower, upper};
    }

    private int findLowerBound(int[] nums, int target) {
        int lower = 0;
        int upper = nums.length - 1;
        int index = -1;

        while (lower <= upper) {
            int mid = (lower + upper) / 2;

            if (nums[mid] >= target) upper = mid - 1;
            else lower = mid + 1;
            if (nums[mid] == target) index = mid;
        }
        return index;
    }

    private int findUpperBound(int[] nums, int target, int start) {
        if (start == -1) return -1;
        int lower = start;
        int upper = nums.length - 1;
        int index = -1;

        while (lower <= upper) {
            int mid = (lower + upper) / 2;

            if (nums[mid] <= target) lower = mid + 1;
            else upper = mid - 1;
            if (nums[mid] == target) index = mid;
        }
        return index;
    }
}
